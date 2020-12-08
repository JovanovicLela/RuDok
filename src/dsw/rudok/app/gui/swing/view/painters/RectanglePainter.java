package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramElement;
import dsw.rudok.app.repository.elements.RectangleElement;

import java.awt.geom.GeneralPath;

public class RectanglePainter extends DevicePainter{

    public RectanglePainter(DiagramElement device) {
        super(device);

        RectangleElement rectangle = (RectangleElement) device;

        shape = new GeneralPath();

        ((GeneralPath)shape).moveTo(rectangle.getPosition().getX(),rectangle.getPosition().getY());

        ((GeneralPath)shape).lineTo(rectangle.getPosition().getX()+rectangle.getSize().width,rectangle.getPosition().getY());

        ((GeneralPath)shape).lineTo(rectangle.getPosition().getX()+rectangle.getSize().width,rectangle.getPosition().getY()+rectangle.getSize().height);

        ((GeneralPath)shape).lineTo(rectangle.getPosition().getX(),rectangle.getPosition().getY()+rectangle.getSize().height);

        ((GeneralPath)shape).closePath();

    }
}
