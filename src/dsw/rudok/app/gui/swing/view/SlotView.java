package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Slot;
import dsw.rudok.app.repository.SlotCircle;
import dsw.rudok.app.repository.SlotRectangle;
import dsw.rudok.app.repository.SlotTriangle;

import java.awt.*;
import java.awt.geom.*;

public class SlotView {

    private static final Color DEFAULT_COLOR = Color.MAGENTA;

    public static void drawShape(Slot slot, Graphics2D g){
        if(slot == null || g == null){
            return;
        }
        g.setColor(DEFAULT_COLOR);
        if(slot instanceof SlotCircle) {
            g.draw(new Ellipse2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY() - slot.getWidth() / 2,
                    slot.getWidth(), slot.getHeight()));
        }else if(slot instanceof SlotRectangle) {
            g.draw(new Rectangle2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY()- slot.getWidth() / 2,
                    slot.getWidth(), slot.getHeight()));
        }else if(slot instanceof SlotTriangle){
            g.draw(new Rectangle2D.Double(slot.getX() - slot.getWidth() / 2, slot.getY()- slot.getWidth() / 2,
                    slot.getWidth(), slot.getHeight()));

        }
    }
}
