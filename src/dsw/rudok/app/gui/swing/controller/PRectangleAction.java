package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PRectangleAction extends AbstractRudokAction {

    public PRectangleAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/rectangle.jpg"));
        putValue(NAME, "Rectangle");
        putValue(SHORT_DESCRIPTION, "Draw rectangle");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().getStateManager().setRectangleState();
    }
}
