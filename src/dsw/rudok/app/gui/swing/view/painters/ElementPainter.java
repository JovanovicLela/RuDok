package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramElement;

import java.awt.*;

public abstract class ElementPainter {
    public ElementPainter(DiagramElement element) {
    }

    public abstract void paint(Graphics2D g, DiagramElement element);
    public abstract boolean elementAt(DiagramElement element, Point pos);

}
