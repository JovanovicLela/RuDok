package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramElement;
import dsw.rudok.app.repository.elements.RectangleElement;

import java.awt.geom.GeneralPath;

public class RectanglePainter extends DevicePainter{

    public RectanglePainter(DiagramElement device) {
        super(device);

        RectangleElement rectangle = (RectangleElement) device;

        shape = new GeneralPath();

        ((GeneralPath) shape).moveTo(rectangle.getPosition().x, rectangle.getPosition().y);
        ((GeneralPath) shape).lineTo(rectangle.getPosition().x +rectangle.getSize().width, rectangle.getPosition().y);
        ((GeneralPath) shape).lineTo(rectangle.getPosition().x +rectangle.getSize().width, rectangle.getPosition().y + rectangle.getSize().height);
        ((GeneralPath) shape).lineTo(rectangle.getPosition().x, rectangle.getPosition().y);
        ((GeneralPath) shape).closePath();
    }
}
