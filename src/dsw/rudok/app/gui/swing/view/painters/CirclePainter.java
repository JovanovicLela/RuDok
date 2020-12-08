package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.CircleElement;
import dsw.rudok.app.repository.elements.DiagramElement;

import java.awt.geom.GeneralPath;

public class CirclePainter extends  DevicePainter{
    public CirclePainter(DiagramElement device) {
        super(device);

        CircleElement or = (CircleElement) device;
        shape = new GeneralPath();
        // .. nastavak, poceti odavde

    }
}
