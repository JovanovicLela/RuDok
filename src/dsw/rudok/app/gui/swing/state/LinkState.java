package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;
import dsw.rudok.app.repository.elements.DiagramElement;

import java.awt.event.MouseEvent;

public class LinkState extends  State{

    private Diagram med;
    private DiagramElement link;

    public LinkState(Diagram md) {
         med = md;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
    }
}
