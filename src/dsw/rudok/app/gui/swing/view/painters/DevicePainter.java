package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramDevice;
import dsw.rudok.app.repository.elements.DiagramElement;
import dsw.rudok.app.repository.elements.InputOutputElement;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Iterator;

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

            // ako crtamo neki elem, potrbni su nam i jnegovi ulazi i izlazi
            Iterator it = device.getInputIterator();
            while (it.hasNext()){
                InputOutputElement d = (InputOutputElement) it.next();
                d.getElementPainter().paint(g, d);
            }

            Iterator it2 = device.getOutputIterator();
            while (it2.hasNext()){
                InputOutputElement d2 = (InputOutputElement) it2.next();
                d2.getElementPainter().paint(g, d2);
            }

            g.drawString(device.getName(), (int)device.getPosition().getX()+10, (int)device.getPosition().getY()+10);
        }

        // ovde crtamo elem i linkove

        g.setPaint(element.getStrokeColor());
        g.setStroke(element.getStroke());
        g.draw(getShape());

        g.setPaint(element.getPaint());
        g.fill(getShape());
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
