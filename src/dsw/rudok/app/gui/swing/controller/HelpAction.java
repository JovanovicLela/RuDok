package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.HelpDialog;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class HelpAction extends AbstractRudokAction{


    public HelpAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.SHIFT_MASK));
        putValue(NAME, "Help");
        putValue(SMALL_ICON, loadIcon("images/help.png"));
        putValue(SHORT_DESCRIPTION, "Help - shortcuts");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        HelpDialog helpDialog = MainFrame.getInstance().getHelpDialog();
        helpDialog.setVisible(true);


    }

}
