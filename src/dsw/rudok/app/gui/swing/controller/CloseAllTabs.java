package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CloseAllTabs extends AbstractRudokAction implements  Observer{

    public CloseAllTabs() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/closeAllTabs.png"));
        putValue(NAME, "Close all tabs");
        putValue(SHORT_DESCRIPTION, "Closes all tabs");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().getDesktop().getTabbedPane().removeAll();

    }

    @Override
    public void update() {
        //MainFrame.getInstance().getTree().getSelectedRuNode().notifyAll();
    }
}
