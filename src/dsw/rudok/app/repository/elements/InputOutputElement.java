package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.InputOutputPainter;

import java.awt.*;
import java.awt.geom.Point2D;

public class InputOutputElement  extends  DiagramElement{

   public  static final  int INPUT = 0;
   public  static final  int OUTPUT = 1;

   protected Point2D position;
   protected  DiagramDevice device;

   protected int ioNo, type;

    public InputOutputElement(Point2D position, Dimension size, Stroke stroke, Paint paint, Color strokeColor, DiagramDevice device, int ioNo, int type) {
        super(stroke, paint, strokeColor);
        this.position = position;
        this.device = device;
        this.ioNo = ioNo;
        this.type = type;
        elementPainter = new InputOutputPainter(this);
    }

    public static DiagramElement createDefault(Point2D pos, Stroke stroke, Paint paint, DiagramDevice device, int ioNo, int type){

        Point2D position = (Point2D) pos.clone();
        position.setLocation(position.getX(), position.getY());
        InputOutputElement io = new InputOutputElement(position, new Dimension(40, 25), stroke, paint, Color.BLUE, device, ioNo, type);

        io.setName("IO" + ioNo);
        return io;
    }
    public static int getINPUT() {
        return INPUT;
    }

    public static int getOUTPUT() {
        return OUTPUT;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public DiagramDevice getDevice() {
        return device;
    }

    public void setDevice(DiagramDevice device) {
        this.device = device;
    }

    public int getIoNo() {
        return ioNo;
    }

    public void setIoNo(int ioNo) {
        this.ioNo = ioNo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
