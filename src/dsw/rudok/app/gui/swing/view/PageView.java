package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.state.CircleSate;
import dsw.rudok.app.gui.swing.state.RectangleState;
import dsw.rudok.app.gui.swing.state.TriangleState;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.Slot;
import dsw.rudok.app.repository.SlotFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// PAGE VIEW

public class PageView extends JInternalFrame{

    // Ova klasa iscrtava na sebe sve komponente koje se nalaze u DiagramModelu
    // a DiagramModel dobijamo iz Diagrama

    static final int FRAME_WIDTH = 300, FRAME_HEIGHT = 300;
    static final int xOffset = 40, yOffset = 40; // koristimo ih za odedjivanje pozicije unutrasnjeg prozora
    private JPanel framework;
    private Page page;

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

    private class Framework extends  JPanel {

        public Framework() {
            addMouseListener(new FrameworkAdapter());
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g; // ALt + enter(quick fix)
            // g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

            for(int i = 0; i < page.getChildren().size(); i++){
                Slot slot = (Slot) page.getChildren().get(i);
                // ... treba nam view za sam slot koji ce da crta
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
                    ///crtamo trougao
                }

                 PageView.this.repaint();
                  //  return; // ....
            }
        }


    }

}
