package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PRotateAction extends AbstractRudokAction{

    public PRotateAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/rotate32.png"));
        putValue(NAME, "Rotate");
        putValue(SHORT_DESCRIPTION, "Rotates the selected element");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
