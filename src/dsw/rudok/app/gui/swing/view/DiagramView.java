package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.event.UpdateEvent;
import dsw.rudok.app.gui.swing.event.UpdateListener;
import dsw.rudok.app.gui.swing.view.painters.ElementPainter;
import dsw.rudok.app.repository.Diagram;
import dsw.rudok.app.repository.elements.DiagramElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;

public class DiagramView extends JInternalFrame implements UpdateListener {

    // Ova klasa iscrtava na sebe sve komponente koje se nalaze u DiagramModelu
    // a DiagramModel dobijamo iz Diagrama


    static  int openFrameCount = 0;
    static final int xOffset = 40, yOffset = 40; // koristimo ih za odedjivanje pozicije unutrasnjeg prozora
    private Diagram diagram;
    private JPanel framework;

    public DiagramView() {

        super("", true, true, true, true);

        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
        setIconifiable(true);
        setClosable(true);
        setSize(400, 400);
        setVisible(true);

        openFrameCount += 1;

        framework = new Framework(); // radna povrsina za dijagram
        framework.setCursor(new Cursor(Cursor.HAND_CURSOR));
        framework.setBackground(Color.WHITE);
        getContentPane().add(framework, BorderLayout.CENTER);

        DiagramController c = new DiagramController();
        framework.addMouseListener(c);
        framework.addMouseMotionListener(c);
    }


    private class DiagramController extends MouseAdapter implements MouseMotionListener {

        public void mousePressed(MouseEvent e) {
            diagram.getStateManager().getCurrentState().mousePressed(e);
        }

        public void mouseReleased(MouseEvent e) {
            diagram.getStateManager().getCurrentState().mouseReleased(e);
        }

        public void mouseDragged(MouseEvent e ){
            diagram.getStateManager().getCurrentState().mouseDragged(e);
        }

    }

    public Diagram getDiagram() {
        return diagram;
    }

    public void setDiagram(Diagram diagram) {
        this.diagram = diagram;
        this.setName(diagram.getName());
        this.diagram.getModel().addUpdateListener(this);
        setTitle(diagram.getName());
    }

    @Override
    public void updatePerformed(UpdateEvent e) {
        repaint();
    }

    private class Framework extends  JPanel{

        protected void paintComponent(Graphics g){
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g; // ALt + enter(quick fix)
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

            /*Iterator<DiagramDevice> it = diagram.getModel().getDeviceIterator();
            while ((it.hasNext())){
                DiagramDevice d = (DiagramDevice)it.next();
                ElementPainter painter = d.getElementPainter();
                painter.paint(g2, d);
            }
              System.out.println("Izvrsen paintComponent (metoda view-a)");*/
       // UPDATE

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Iterator<DiagramElement> it = diagram.getModel().getDeviceIterator();
            while(it.hasNext()){
                DiagramElement element = it.next();
                ElementPainter painter =  element.getElementPainter();
                painter.paint(g2, element);

            }
        }
    }

  /*  private class MouseController extends MouseAdapter{

        public  void mousePressed(MouseEvent e ){

            if(e.getButton() == MouseEvent.BUTTON1){

                Point position = e.getPoint();
                GeneralPath gp = new GeneralPath();

                Paint fill = new Color(255, 255, 255);
*/
               // RectangleElement rectangle = new RectangleElement(fill, new BasicStroke(2f), new Dimension(100, 50), position);
// kada se uradi StateManager otkomentarisati !
                //rectangle.setName("Rectangle " + diagram.getModel().getElementCount());
              //  diagram.getModel().addDiagramElements(rectangle);




}
