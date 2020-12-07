package dsw.rudok.app.repository.elements;

import java.awt.*;

public abstract class DiagramDevice extends  DiagramElement{

    protected Dimension size;
    protected Point position;

    public DiagramDevice(Paint paint, Stroke stroke, Dimension size, Point position) {
        super(paint, stroke);
        this.size = size;
        this.position = position;
    }

    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
