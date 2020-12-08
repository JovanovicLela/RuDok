package dsw.rudok.app.gui.swing.view.painters;

import dsw.rudok.app.repository.elements.InputOutputElement;

import java.awt.geom.GeneralPath;

public class InputOutputPainter extends  DevicePainter{

    public InputOutputPainter(InputOutputElement device) {
        super(device);

        shape = new GeneralPath();

        if(device.getType() == InputOutputElement.INPUT){

            ((GeneralPath) shape).moveTo(device.getPosition().getX(), device.getPosition().getY());
            ((GeneralPath) shape).lineTo(device.getPosition().getX()-5, device.getPosition().getY());

        }else if(device.getType() == InputOutputElement.OUTPUT){

            ((GeneralPath)shape).moveTo(device.getPosition().getX(),device.getPosition().getY());
            ((GeneralPath)shape).lineTo(device.getPosition().getX()+5,device.getPosition().getY());

        }

        }



}
