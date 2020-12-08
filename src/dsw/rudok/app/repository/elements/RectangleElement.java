package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.RectanglePainter;

import java.awt.*;
import java.awt.geom.Point2D;

public class RectangleElement extends  DiagramDevice{

    public RectangleElement(Point2D position, Dimension size, Stroke stroke, Paint paint, Color strokeColor, int inputNo, int outputNo) {
        super(position, size, stroke, paint, strokeColor, inputNo, outputNo);
        elementPainter = new RectanglePainter(this);
    }
}
