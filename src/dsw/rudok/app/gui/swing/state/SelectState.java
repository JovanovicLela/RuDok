package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.gui.swing.view.PageView;

import java.awt.event.MouseEvent;

public class SelectState extends State {

    private  PageView med;

    private int elementInMotion = -1; //indeks selektovanog elem
    private int mouseButton = 0;

    public SelectState() {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }

}
