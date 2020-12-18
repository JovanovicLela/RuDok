package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.gui.swing.view.PageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PDeleteElementAction extends AbstractRudokAction{

    public PDeleteElementAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/deleteElem.png"));
        putValue(NAME, "Delete");
        putValue(SHORT_DESCRIPTION, "Deletes the selected element");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        PageView pw = null;

        pw = (PageView) MainFrame.getInstance().getDesktopPane().getSelectedFrame();

    }
}
