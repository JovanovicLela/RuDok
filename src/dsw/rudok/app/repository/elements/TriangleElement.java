package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.TrianglePainter;

import java.awt.*;
import java.awt.geom.Point2D;

public class TriangleElement extends SlotDevice {

    public TriangleElement(Point2D position, Dimension size, Stroke stroke, Paint paint, Color strokeColor) {
        super(position, size, stroke, paint, strokeColor, 3, 3);

        elementPainter = new TrianglePainter(this);
    }

    public static SlotDevice createDefault(Point2D pos, int elemNo){

        Point2D position = (Point2D) pos.clone();
        Paint fill = Color.WHITE;

        TriangleElement triangleElement = new TriangleElement(
                position, new Dimension(60, 60),
                new BasicStroke((float)(2), BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL),
                fill, Color.BLACK);

        triangleElement.setName("Triangle" + elemNo);
        return  triangleElement;



    }

}
