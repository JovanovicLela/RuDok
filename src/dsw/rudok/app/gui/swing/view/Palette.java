package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class Palette extends JToolBar {

    public Palette() {

        super(JToolBar.VERTICAL);

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        ButtonGroup bt = new ButtonGroup();


    }
}
