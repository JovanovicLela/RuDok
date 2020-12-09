package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;
import dsw.rudok.app.repository.elements.CircleElement;
import dsw.rudok.app.repository.elements.DiagramDevice;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CircleSate extends  State{

    private Diagram med;

    public CircleSate(Diagram md) {
        med = md;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        if(e.getButton() == MouseEvent.BUTTON1){

            if(med.getModel().getDeviceAtPosition(position) == -1){

               DiagramDevice device = CircleElement.createDefault(position, med.getModel().getDeviceCount());
               med.getModel().addDiagramElements(device);
           }
        }
    }
}
