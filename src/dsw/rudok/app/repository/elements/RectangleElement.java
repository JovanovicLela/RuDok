package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.RectanglePainter;

import java.awt.*;

public class RectangleElement extends  DiagramDevice{

    public RectangleElement(Paint paint, Stroke stroke, Dimension size, Point position) {
        super(paint, stroke, size, position);
        elementPainter = new RectanglePainter(this);
    }


}
