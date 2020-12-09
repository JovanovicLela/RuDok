package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.LinkPainter;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkElement extends  DiagramElement{

    protected DiagramDevice startDevice;
    protected InputOutputElement output;

    protected DiagramDevice endDevice;
    protected InputOutputElement input;

    protected ArrayList<Point2D> points=new ArrayList<Point2D>();


    public LinkElement(DiagramDevice startDevice, InputOutputElement input, Stroke stroke, Paint paint, Color strokeColor) {
        super(stroke, paint, strokeColor);

        this.startDevice = startDevice;
        this.input = input;
        this.endDevice = startDevice;

        this.input = new InputOutputElement(new Point2D.Double(output.getPosition().getX(), output.getPosition().getY()),
                                            new Dimension(0,0),
                                            new BasicStroke(1F), Color.WHITE, Color.BLACK, null, 0, 0);


        elementPainter = new LinkPainter(this);
    }

    public static DiagramElement createDefault(DiagramDevice startDevice,
                                               InputOutputElement input,
                                               int elemNo){
        Paint fill = Color.WHITE;
        LinkElement or=new LinkElement(startDevice,
                input,
                new BasicStroke((float)(2), BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL ),
                fill,
                Color.BLUE);
        or.setName("LINK " + elemNo);
        return or;
    }
    public void addPoint(Point2D p){
        points.add(p);

    }
    public Iterator getPointsIterator(){
        return points.iterator();
    }

    public void setPainter(DiagramElement link){
        elementPainter=new LinkPainter(link);
    }

    public DiagramDevice getStartDevice() {
        return startDevice;
    }

    public void setStartDevice(DiagramDevice startDevice) {
        this.startDevice = startDevice;
    }

    public InputOutputElement getOutput() {
        return output;
    }

    public void setOutput(InputOutputElement output) {
        this.output = output;
    }

    public DiagramDevice getEndDevice() {
        return endDevice;
    }

    public void setEndDevice(DiagramDevice endDevice) {
        this.endDevice = endDevice;
    }

    public InputOutputElement getInput() {
        return input;
    }

    public void setInput(InputOutputElement input) {
        this.input = input;
    }

    public ArrayList<Point2D> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point2D> points) {
        this.points = points;
    }
}
