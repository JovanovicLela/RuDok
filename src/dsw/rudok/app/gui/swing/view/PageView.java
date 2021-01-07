package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.AppCore;
import dsw.rudok.app.gui.swing.errorHandler.ErrorType;
import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.slot.Slot;
import dsw.rudok.app.repository.slot.SlotCircle;
import dsw.rudok.app.repository.slot.SlotFactory;
import dsw.rudok.app.repository.slot.SlotRectangle;
import dsw.rudok.app.repository.state.CircleSate;
import dsw.rudok.app.repository.state.RectangleState;
import dsw.rudok.app.repository.state.SelectState;
import dsw.rudok.app.repository.state.TriangleState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

// PAGE VIEW

public class PageView extends JInternalFrame implements Observer {

    // Ova klasa iscrtava na sebe sve komponente koje se nalaze u DiagramModelu
    // a DiagramModel dobijamo iz Diagrama

    static final int FRAME_WIDTH = 340, FRAME_HEIGHT = 320;
    static final int xOffset = 30, yOffset = 30; // koristimo ih za odedjivanje pozicije unutrasnjeg prozora
    private JPanel framework;
    private Page page;
    private Slot selectedSlot = null;


// novo: prosledjena stranica
    public PageView(Page page, int pageNumber) {

        super(page.getParent().getName() + " - " + page.getName(), true, true, true, true);
        this.page = page;
        ImageIcon img = new ImageIcon(getClass().getResource("images/diagramView.png"));
        this.setFrameIcon(img);
        setLocation(xOffset * pageNumber, yOffset * pageNumber);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);

        framework = new Framework(); // radna povrsina za crtanje slotova
        framework.setCursor(new Cursor(Cursor.HAND_CURSOR));
        framework.setBackground(Color.WHITE);
        framework.setFocusable(true);
        add(framework);

    }

    public Slot getSelectedSlot() {
        return selectedSlot;
    }

    public int getNumberOfSlotsPerType(SlotFactory.SlotType slotType){
        if(slotType == null){
            //throw new IllegalArgumentException("bla bla");
            AppCore.getInstance().getError().onError(ErrorType.NULL_SLOT);
        }

        int res = 0;
        switch (slotType){
            case CIRCLE:
                for(int i = 0; i < page.getChildren().size(); i++){
                    Slot slot = (Slot) page.getChildren().get(i);
                    if(slot instanceof SlotCircle){
                        res++;
                    }
                }
                break;
            case RECTANGLE:
                for(int i = 0; i < page.getChildren().size(); i++){
                    Slot slot = (Slot) page.getChildren().get(i);
                    if(slot instanceof SlotRectangle){
                        res++;
                    }
                }
                break;
            case TRIANGLE:
                // ...
                break;
        }
        return res;
    }

    @Override
    public void update() {
        repaint();
    }

    private class Framework extends  JPanel {

        public Framework() {
            FrameworkAdapter frameworkAdapter = new FrameworkAdapter();
            addMouseListener(frameworkAdapter);
            addMouseMotionListener(frameworkAdapter);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g; // ALt + enter(quick fix)

            //providnost
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            for (int i = 0; i < page.getChildren().size(); i++) {
                Slot slot = (Slot) page.getChildren().get(i);
                SlotView.drawShape(slot, g2);
            }
        }

        class FrameworkAdapter extends MouseAdapter {
            @Override
            public void mousePressed(MouseEvent e) {
                Slot slot = null;

                if (MainFrame.getInstance().getStateManager().getCurrentState() instanceof CircleSate) {
                    if(selectedSlot(e.getX(), e.getY()) != null){
                        return;
                    }
                    deselectAllSlots();

                    slot = SlotFactory.createSlot("Circle " + (getNumberOfSlotsPerType(SlotFactory.SlotType.CIRCLE) + 1),
                            page, e.getX(), e.getY(), 80, 80, SlotFactory.SlotType.CIRCLE);

                    MainFrame.getInstance().getTree().addSlot(page, slot);
                } else if (MainFrame.getInstance().getStateManager().getCurrentState() instanceof RectangleState) {
                    if(selectedSlot(e.getX(), e.getY()) != null){
                        return;
                    }
                    deselectAllSlots();
                    slot = SlotFactory.createSlot("Rectangle " + (getNumberOfSlotsPerType(SlotFactory.SlotType.RECTANGLE) + 1),
                            page, e.getX(), e.getY(), 80, 40, SlotFactory.SlotType.RECTANGLE);
                    MainFrame.getInstance().getTree().addSlot(page, slot);
                } else if (MainFrame.getInstance().getStateManager().getCurrentState() instanceof TriangleState) {
                 //   slot = SlotFactory.createSlot("Triangle " + (page.getChildren().size() + 1),
                         //   page, e.getX(), e.getY(), 40, 40, SlotFactory.SlotType.TRIANGLE);
                    // ... crtamo trougao .....
                } else if(MainFrame.getInstance().getStateManager().getCurrentState() instanceof SelectState){

                    deselectAllSlots();

                    Slot s = selectedSlot(e.getX(), e.getY());
                    if(s != null){
                        s.setSelected(true);
                        selectedSlot = s;
                    }
                }
                PageView.this.repaint();
            }

            @Override
            public void mouseClicked(MouseEvent e) {

                if (selectedSlot == null) {
                    return;
                }

                if(e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)){
                    if(selectedSlot.getTextEditor() == null || selectedSlot.getImageEditor() == null){

                        String[] options = {"Add Image", "Edit text"};
                        int answer = JOptionPane.showOptionDialog(null, "Choose content", "Edit content",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

                        if(answer == JOptionPane.NO_OPTION){
                            if(selectedSlot.getTextEditor() == null){
                                selectedSlot.setTextEditor(new TextEditor(null, null, false, selectedSlot));
                                selectedSlot.getTextEditor().setVisible(true);
                            } else {
                                selectedSlot.getTextEditor().setVisible(true);
                            }
                        }
                        if(answer == JOptionPane.YES_OPTION){
                            if(selectedSlot.getImageEditor() == null){
                                selectedSlot.setImageEditor(new ImageEditor(null, null, false, selectedSlot));
                                selectedSlot.getImageEditor().setVisible(true);
                            }else {
                                selectedSlot.getImageEditor().setVisible(true);
                        }
                        }

                    } else {
                        String[] options = {"Add Image", "Edit text"};
                        int answer = JOptionPane.showOptionDialog(null, "Choose content", "",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);
                        if (answer == JOptionPane.YES_OPTION)
                            selectedSlot.getTextEditor().setVisible(true);
                        if (answer == JOptionPane.NO_OPTION)
                            selectedSlot.getImageEditor().setVisible(true);

                    }
                }
                PageView.this.repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {

                if (selectedSlot == null) {
                    return;
                }
                int x = e.getX();
                int y = e.getY();

                if (SlotView.getDownerRightSelectionRectangle(selectedSlot).contains(x, y)) {

                    Rectangle2D selRectangle = SlotView.getDownerRightSelectionRectangle(selectedSlot);
                    Rectangle2D newSelRectangle = new Rectangle2D.Double(x - 2.5, y - 2.5, 5, 5);

                    double deltaX = newSelRectangle.getX() - selRectangle.getX();
                    double deltaY = newSelRectangle.getY() - selRectangle.getY();

                    if (selectedSlot.getWidth() + deltaX > 0) {
                        double x0 = selectedSlot.getX() - (selectedSlot.getWidth() / 2);
                        selectedSlot.setWidth(selectedSlot.getWidth() + deltaX);
                        double newX = x0 + selectedSlot.getWidth() / 2;
                        selectedSlot.setX(newX);
                    }

                    if(selectedSlot.getHeight() + deltaY > 0) {
                        double y0 = selectedSlot.getY() - (selectedSlot.getHeight()/2);
                        selectedSlot.setHeight(selectedSlot.getHeight() + deltaY);
                        double newY = y0 + selectedSlot.getHeight()/2;
                        selectedSlot.setY(newY);
                    }
                }

                if (SlotView.getUpperLeftSelectionRectangle(selectedSlot).contains(x, y)) {

                }
                if (SlotView.getUpperRightSelectionRectangle(selectedSlot).contains(x, y)) {

                }
                if (SlotView.getDownerLeftSelectionRectangle(selectedSlot).contains(x, y)) {

                }
                PageView.this.repaint();
            }

            private Slot selectedSlot(int x, int y) {
                for (int i = 0; i < page.getChildren().size(); i++) {
                    Slot slot = (Slot) page.getChildren().get(i);
                    Rectangle2D.Double rectangle = new Rectangle2D.Double((slot.getX() - slot.getWidth() / 2) - 10, (slot.getY() - slot.getHeight() / 2) - 10, slot.getWidth() + 20, slot.getHeight() + 20);
                    if (rectangle.contains(x, y)) {
                        return slot;
                    }
                }
                return null;
            }

            private void deselectAllSlots() {
                for (int i = 0; i < page.getChildren().size(); i++) {
                    Slot slot = (Slot) page.getChildren().get(i);
                    slot.setSelected(false);
                }
            }
        }
    }
    }
