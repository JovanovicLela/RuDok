package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;

import java.awt.event.MouseEvent;

public class RectangleState extends  State{

    private Diagram med;

    public RectangleState(Diagram md) {
          med = md;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }
}
