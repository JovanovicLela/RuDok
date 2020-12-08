package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramDevice;
import dsw.rudok.app.repository.elements.DiagramElement;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class DevicePainter extends  ElementPainter{

    protected  Shape shape;

    public DevicePainter(DiagramElement device) {
        super(device);

    }

    @Override
    public void paint(Graphics2D g, DiagramElement element) {

        AffineTransform old = g.getTransform();

        g.setPaint(Color.RED);
        g.setStroke(element.getStroke());
        g.draw(getShape());
        g.setPaint(element.getPaint());
        g.fill(getShape());

        if(element instanceof DiagramDevice){
            g.setPaint(Color.BLACK);
            DiagramDevice device = (DiagramDevice)element;
            g.drawString(device.getName(), (int)device.getPosition().getX()+10, (int)device.getPosition().getY()+10);

        }
        g.setTransform(old);




    }

    public boolean isElementAt( Point pos){
        return getShape().contains(pos);
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
