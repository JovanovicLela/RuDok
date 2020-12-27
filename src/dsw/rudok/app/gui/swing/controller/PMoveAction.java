package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PMoveAction extends AbstractRudokAction {

    public PMoveAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/move.png"));
        putValue(NAME, "Move");
        putValue(SHORT_DESCRIPTION, "Moves the selected element");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MainFrame.getInstance();

    }
}
