package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CLoseTab extends AbstractRudokAction  {

    public CLoseTab(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/closeTab.png"));
        putValue(NAME, "Close tab");
        putValue(SHORT_DESCRIPTION, "Closes the selected tab");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MainFrame.getInstance().getDesktop().getTabbedPane().remove(MainFrame.getInstance().getDesktop().getTabbedPane().getSelectedComponent());

    }
}
