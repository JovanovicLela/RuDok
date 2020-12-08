package dsw.rudok.app.repository.elements;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class DiagramDevice extends  DiagramElement{

    protected Dimension size;
    protected Point2D position;

    protected  int inputNo;
    protected  int outputNo;

    public DiagramDevice(Point2D position, Dimension size, Stroke stroke, Paint paint, Color strokeColor, int inputNo, int outputNo) {
        super(stroke, paint, strokeColor);
        this.size = size;

        position.setLocation(position.getX()-size.getWidth()/2, position.getY()-size.getHeight()/2);
        this.position = position;
        this.strokeColor = strokeColor;
        this.inputNo = inputNo;
        this.outputNo = outputNo;


    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }
}
