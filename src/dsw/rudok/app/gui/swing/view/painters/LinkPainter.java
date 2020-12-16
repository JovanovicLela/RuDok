package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.SlotElement;
import dsw.rudok.app.repository.elements.LinkElement;

import java.awt.geom.GeneralPath;

public class LinkPainter extends  DevicePainter{

    public LinkPainter(SlotElement device) {
        super(device);

        LinkElement link = (LinkElement) device;
        shape = new GeneralPath();

        ((GeneralPath)shape).moveTo(link.getOutput().getPosition().getX()+5,link.getOutput().getPosition().getY());
        ((GeneralPath)shape).lineTo(link.getInput().getPosition().getX()-5,link.getInput().getPosition().getY());
    }
}
