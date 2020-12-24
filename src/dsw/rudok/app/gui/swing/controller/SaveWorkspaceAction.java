package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SaveWorkspaceAction extends AbstractRudokAction{

    public SaveWorkspaceAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveP.png"));
        putValue(NAME, "Save workspace");
        putValue(SHORT_DESCRIPTION, "Save workspace");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
