package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.DiagramElement;
import dsw.rudok.app.repository.elements.TriangleElement;

import java.awt.geom.GeneralPath;

public class TrianglePainter extends DevicePainter{
    public TrianglePainter(DiagramElement device) {
        super(device);

        TriangleElement triangle = (TriangleElement) device;

        shape = new GeneralPath();

        ((GeneralPath)shape).moveTo(triangle.getPosition().getX(), triangle.getPosition().getY() + triangle.getSize().height);

        ((GeneralPath)shape).lineTo(triangle.getPosition().getX() + triangle.getSize().width/2, triangle.getPosition().getY() - triangle.getSize().height/3);

        ((GeneralPath)shape).lineTo(triangle.getPosition().getX() + triangle.getSize().width, triangle.getPosition().getY() + triangle.getSize().height);

        ((GeneralPath)shape).closePath();


    }
}
