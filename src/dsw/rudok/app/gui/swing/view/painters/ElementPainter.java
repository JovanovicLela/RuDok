package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.SlotElement;

import java.awt.*;
import java.io.Serializable;

public abstract class ElementPainter implements Serializable {

    private static final long serialVersionUID = 1;

    public ElementPainter(SlotElement element) {
    }

    public abstract void paint(Graphics2D g, SlotElement element);
    public abstract boolean isElementAt(Point pos);

}
