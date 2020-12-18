package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PResizeAction extends AbstractRudokAction{

    public PResizeAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/resize32.png"));
        putValue(NAME, "Resize");
        putValue(SHORT_DESCRIPTION, "Resizes the selected element");
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
