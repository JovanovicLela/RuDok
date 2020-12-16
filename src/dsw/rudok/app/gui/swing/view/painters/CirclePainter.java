package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.CircleElement;
import dsw.rudok.app.repository.elements.SlotElement;

import java.awt.geom.GeneralPath;

// Circle painter specificno zaduzen z

public class CirclePainter extends  DevicePainter{

    public CirclePainter(SlotElement device) {
        super(device);

        CircleElement or = (CircleElement) device;
        shape = new GeneralPath();


        ((GeneralPath)shape).moveTo(or.getPosition().getX() + or.getSize().getWidth() / 2, or.getPosition().getY());

        ((GeneralPath)shape).quadTo(or.getPosition().getX()+or.getSize().getWidth(), or.getPosition().getY(),
                or.getPosition().getX()+or.getSize().getWidth(), or.getPosition().getY() + or.getSize().getHeight()/2);

        ((GeneralPath)shape).quadTo(or.getPosition().getX()+or.getSize().getWidth(), or.getPosition().getY()+or.getSize().getHeight(),
                or.getPosition().getX()+or.getSize().getWidth()/2, or.getPosition().getY()+or.getSize().getHeight());

        ((GeneralPath)shape).quadTo(or.getPosition().getX(), or.getPosition().getY()+or.getSize().getHeight(),
                or.getPosition().getX(), or.getPosition().getY()+or.getSize().getHeight()/2);


        ((GeneralPath)shape).quadTo(or.getPosition().getX(), or.getPosition().getY(),
                or.getPosition().getX()+or.getSize().getWidth()/2,or.getPosition().getY());





    }
}
