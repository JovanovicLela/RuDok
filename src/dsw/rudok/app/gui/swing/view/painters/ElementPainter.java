package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.SlotElement;

import java.awt.*;

public abstract class ElementPainter {
    public ElementPainter(SlotElement element) {
    }

    public abstract void paint(Graphics2D g, SlotElement element);
    public abstract boolean isElementAt(Point pos);

}
