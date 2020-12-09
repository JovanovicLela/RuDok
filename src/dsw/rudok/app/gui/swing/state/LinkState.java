package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;
import dsw.rudok.app.repository.elements.DiagramElement;

import java.awt.*;
import java.awt.event.MouseEvent;

public class LinkState extends  State{

    private Diagram med;
    private DiagramElement link;

    public LinkState(Diagram md) {
         med = md;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point position = e.getPoint();
        link = null;
        if(e.getButton() == MouseEvent.BUTTON1){
            // zapoceti iscrtavanje linka
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        if(link == null)
            return;
        // osvezi prikaz linka sa novim koordinatama
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        Point position = e.getPoint();
        if(e.getButton() == MouseEvent.BUTTON1){//otpusten levi taster misa
            // zavrsiti iscrtavanje linka
        }
    }
}
