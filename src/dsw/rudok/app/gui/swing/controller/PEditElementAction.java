package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PEditElementAction extends AbstractRudokAction{

    public PEditElementAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/edit.png"));
        putValue(NAME, "Edit element");
        putValue(SHORT_DESCRIPTION, "Edit content");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MainFrame.getInstance().getStateManager().setSelectState();

    }
}
