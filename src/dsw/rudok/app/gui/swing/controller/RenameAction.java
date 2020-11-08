package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class RenameAction extends  AbstractRudokAction{

    public RenameAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/renameIcon.png"));
        putValue(NAME, "Rename");
        putValue(SHORT_DESCRIPTION, "Changes name");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
