package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.slot.Slot;
import dsw.rudok.app.repository.slot.SlotCircle;
import dsw.rudok.app.repository.slot.SlotRectangle;
import dsw.rudok.app.repository.slot.SlotTriangle;

import java.awt.*;
import java.awt.geom.*;

public class SlotView {

    private static final Color DEFAULT_COLOR = Color.MAGENTA;
    private static final Color SELECTED_COLOR = Color.BLUE;
    private  static final int SELECTED_SQUARE_SIZE = 5;


    public static void drawShape(Slot slot, Graphics2D g) {
        if (slot == null || g == null) {
            return;
        }
        g.setColor(DEFAULT_COLOR);
        if (slot instanceof SlotCircle) {
            g.draw(new Ellipse2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY() - slot.getHeight()/ 2,
                    slot.getWidth(), slot.getHeight()));
            g.drawString(slot.getName(), (int)(slot.getX() - slot.getWidth()/4), (int) slot.getY());
        } else if (slot instanceof SlotRectangle) {
            g.draw(new Rectangle2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY() - slot.getHeight() / 2,
                    slot.getWidth(), slot.getHeight()));
            g.drawString(slot.getName(), (int)(slot.getX() - slot.getWidth()/2 + 5), (int) slot.getY());
        } else if (slot instanceof SlotTriangle) {
            g.draw(new Rectangle2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY() - slot.getWidth() / 2,
                    slot.getWidth(), slot.getHeight())); // .. nacrtati trougao...

        }
        if (slot.isSelected()) {
            g.setColor(SELECTED_COLOR);
            double x = (slot.getX() - slot.getWidth() / 2) - SELECTED_SQUARE_SIZE;
            double y = (slot.getY() - slot.getHeight() / 2) - SELECTED_SQUARE_SIZE;
            g.fill(new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE));

            x = (slot.getX() + slot.getWidth() / 2);
            y = (slot.getY() + slot.getHeight() / 2);
            g.fill(new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE));

            x = (slot.getX() + slot.getWidth() / 2);
            y = (slot.getY() - slot.getHeight() / 2) - SELECTED_SQUARE_SIZE;
            g.fill(new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE));

            x = (slot.getX() - slot.getWidth() / 2) - SELECTED_SQUARE_SIZE;
            y = (slot.getY() + slot.getHeight() / 2);
            g.fill(new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE));

        }
    }

        public static Rectangle2D.Double getUpperLeftSelectionRectangle(Slot slot){
            double x = (slot.getX() - slot.getWidth()/2) - SELECTED_SQUARE_SIZE;
            double y = (slot.getY() - slot.getHeight()/2) - SELECTED_SQUARE_SIZE;
            return new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE);
        }

        public static Rectangle2D.Double getUpperRightSelectionRectangle(Slot slot){
            double x = (slot.getX() + slot.getWidth()/2);
            double y = (slot.getY() - slot.getHeight()/2) - SELECTED_SQUARE_SIZE;
            return new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE);
        }

        public static Rectangle2D.Double getDownerLeftSelectionRectangle(Slot slot){
            double x = (slot.getX() - slot.getWidth()/2) - SELECTED_SQUARE_SIZE;
            double y = (slot.getY() + slot.getHeight()/2);
            return new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE);
        }
        public static Rectangle2D.Double getDownerRightSelectionRectangle(Slot slot){
            double x = (slot.getX() + slot.getWidth()/2);
            double y = (slot.getY() + slot.getHeight()/2);
            return new Rectangle2D.Double(x, y, SELECTED_SQUARE_SIZE, SELECTED_SQUARE_SIZE);
        }

    }

