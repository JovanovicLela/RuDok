package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.AboutDialog;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class AboutAction extends  AbstractRudokAction{
    public AboutAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
        putValue(NAME, "About info");
        putValue(SMALL_ICON, loadIcon("images/about.png"));
        putValue(SHORT_DESCRIPTION, "About info");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AboutDialog aboutDialog = MainFrame.getInstance().getAboutDialog();
        aboutDialog.setVisible(true);
    }
}
