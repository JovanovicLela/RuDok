package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TextEditAction extends AbstractRudokAction{

    public TextEditAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveW.png"));
        putValue(NAME, "Share document");
        putValue(SHORT_DESCRIPTION, "Share document");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MainFrame.getInstance().getStateManager().setSelectState();
    }
}
