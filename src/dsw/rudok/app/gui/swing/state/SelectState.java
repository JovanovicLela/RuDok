package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class SelectState extends State {

    private Diagram med;
    private int elementInMotion = -1; // indeks selektovanog elem

    public SelectState(Diagram md) {
        med = md;
    }
    @Override
    public void mousePressed(MouseEvent e) {

        Point position = e.getPoint();

        if(e.getButton() == MouseEvent.BUTTON1){

            // !!! nastaviti
        }
    }

}
