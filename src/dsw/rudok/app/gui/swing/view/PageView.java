package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.state.CircleSate;
import dsw.rudok.app.repository.state.RectangleState;
import dsw.rudok.app.repository.state.TriangleState;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.slot.Slot;
import dsw.rudok.app.repository.slot.SlotFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

// PAGE VIEW

public class PageView extends JInternalFrame{

    // Ova klasa iscrtava na sebe sve komponente koje se nalaze u DiagramModelu
    // a DiagramModel dobijamo iz Diagrama

    static final int FRAME_WIDTH = 300, FRAME_HEIGHT = 300;
    static final int xOffset = 40, yOffset = 40; // koristimo ih za odedjivanje pozicije unutrasnjeg prozora
    private JPanel framework;
    private Page page;
    private Slot selectedSlot = null;
 //   StateManager stateManager = new StateManager();

// novo: prosledjena stranica
    public PageView(Page page, int pageNumber) {

        super(page.getParent().getName() + " - " + page.getName(), true, true, true, true);
        this.page = page;
        ImageIcon img = new ImageIcon(getClass().getResource("images/diagramView.png"));
        this.setFrameIcon(img);
        setLocation(xOffset * pageNumber, yOffset * pageNumber);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setIconifiable(true);
        setClosable(true);
        setVisible(true);
        setResizable(true);

        framework = new Framework(); // radna povrsina za dijagram
        framework.setCursor(new Cursor(Cursor.HAND_CURSOR));
        framework.setBackground(Color.WHITE);
        framework.setFocusable(true);
        add(framework);
    }

    public Slot getSelectedSlot() {
        return selectedSlot;
    }

    private class Framework extends  JPanel {

        public Framework() {
            FrameworkAdapter frameworkAdapter = new FrameworkAdapter();
            addMouseListener(new FrameworkAdapter());
            addMouseMotionListener(frameworkAdapter);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g; // ALt + enter(quick fix)

           //providnost
             g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
             g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            for(int i = 0; i < page.getChildren().size(); i++){
                Slot slot = (Slot) page.getChildren().get(i);
                SlotView.drawShape(slot, g2);
            }
        }

        class FrameworkAdapter extends MouseAdapter {
            @Override
            public void mousePressed(MouseEvent e) {
                Slot slot = null;
                if (MainFrame.getInstance().getStateManager().getCurrentState() instanceof CircleSate){
                    slot = SlotFactory.createSlot("Slot" + (page.getChildren().size() + 1),
                            page, e.getX(), e.getY(), 40, 40, SlotFactory.SlotType.CIRCLE);
                MainFrame.getInstance().getTree().addSlot(page, slot);
            }else if(MainFrame.getInstance().getStateManager().getCurrentState() instanceof RectangleState){
                    slot = SlotFactory.createSlot("Slot" + (page.getChildren().size() + 1),
                            page, e.getX(), e.getY(),40,20, SlotFactory.SlotType.RECTANGLE);
                    MainFrame.getInstance().getTree().addSlot(page, slot);
                }else if(MainFrame.getInstance().getStateManager().getCurrentState() instanceof TriangleState){
                    slot = SlotFactory.createSlot("Slot" + (page.getChildren().size() + 1),
                            page, e.getX(), e.getY(), 40, 40, SlotFactory.SlotType.TRIANGLE);
                }

                 PageView.this.repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if(selectedSlot == null){
                    return;
                }
                int x = e.getX();
                int y  =e.getY();
                if(SlotView.getDownerRightSelectionRectangle(selectedSlot).contains(x,y)) {

                    Rectangle2D selRectangle = SlotView.getDownerRightSelectionRectangle(selectedSlot);
                    Rectangle2D newSelRectangle = new Rectangle2D.Double(x - 2.5, y - 2.5, 5, 5);

                    double deltaX = newSelRectangle.getX() - selRectangle.getX();
                    double deltaY = newSelRectangle.getY() - selRectangle.getY();

                    if(selectedSlot.getWidth() + deltaX > 0){
                        double x0 = selectedSlot.getX() - (selectedSlot.getWidth()/2);
                        selectedSlot.setWidth(selectedSlot.getWidth() + deltaX);
                        double newX = x0 + selectedSlot.getWidth()/2;
                        selectedSlot.setX(newX);
                    }

                }

            }
        }


    }

}
