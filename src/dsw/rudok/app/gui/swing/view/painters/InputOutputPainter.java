package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.InputOutputElement;

import java.awt.geom.GeneralPath;

public class InputOutputPainter extends  DevicePainter{

    public InputOutputPainter(InputOutputElement device) {
        super(device);

        shape = new GeneralPath();

      //  if(device.get)


    }
}
