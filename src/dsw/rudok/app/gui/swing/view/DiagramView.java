package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.event.UpdateEvent;
import dsw.rudok.app.gui.swing.event.UpdateListener;
import dsw.rudok.app.gui.swing.view.painters.ElementPainter;
import dsw.rudok.app.repository.Diagram;
import dsw.rudok.app.repository.elements.DiagramDevice;
import dsw.rudok.app.repository.elements.RectangleElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.util.Iterator;

public class DiagramView extends JInternalFrame implements UpdateListener {

    static  int openFrameCount = 0;
    static final int xOffset = 40, yOffset = 40;
    private Diagram diagram;
    private JPanel framework;

    public DiagramView() {

        super("", true, true, true, true);

        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
        setIconifiable(true);
        setClosable(true);
        setSize(500, 200);
        setVisible(true);

        openFrameCount += 1;

        framework = new Framework();
        framework.setCursor(new Cursor(Cursor.HAND_CURSOR));
        framework.setBackground(Color.WHITE);
        getContentPane().add(framework, BorderLayout.CENTER);
        framework.addMouseListener(new MouseController());

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
            Iterator<DiagramDevice> it = diagram.getModel().getDeviceIterator();
            while ((it.hasNext())){
                DiagramDevice d = (DiagramDevice)it.next();
                ElementPainter painter = d.getElementPainter();
                painter.paint(g2, d);
            }
            System.out.println("Izvrsen paintComponent (metoda view-a)");
        }
    }

    private class MouseController extends MouseAdapter{

        public  void mousePressed(MouseEvent e ){

            if(e.getButton() == MouseEvent.BUTTON1){

                Point position = e.getPoint();
                GeneralPath gp = new GeneralPath();

                Paint fill = new Color(255, 255, 255);

                RectangleElement rectangle = new RectangleElement(fill, new BasicStroke(2f), new Dimension(100, 50), position);

                rectangle.setName("Rectangle " + diagram.getModel().getElementCount());
                diagram.getModel().addDiagramElements(rectangle);

            }
        }

    }
}
