package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.PageView;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PCircleAction extends AbstractRudokAction {

    public PCircleAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/circle.jpg"));
        putValue(NAME, "Circle");
        putValue(SHORT_DESCRIPTION, "Draw circle");

    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
