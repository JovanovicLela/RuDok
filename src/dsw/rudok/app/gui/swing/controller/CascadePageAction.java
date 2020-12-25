package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CascadePageAction extends AbstractRudokAction{

    public CascadePageAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/cascade.png"));
        putValue(NAME, "Cascade");
        putValue(SHORT_DESCRIPTION, "Cascade");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
