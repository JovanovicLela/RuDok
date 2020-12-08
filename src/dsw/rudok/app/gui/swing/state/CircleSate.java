package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;

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
              // DiagramDevice device =
               //potrebno napraviti Circle elem
           }
        }
    }
}
