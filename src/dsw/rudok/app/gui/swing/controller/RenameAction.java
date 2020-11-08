package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class RenameAction extends  AbstractRudokAction{

    private JTextField textField;
    private int selectedIndex;



    public RenameAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/renameIcon.png"));
        putValue(NAME, "Rename");
        putValue(SHORT_DESCRIPTION, "Changes name");
    }

    @Override
    public void actionPerformed(ActionEvent e) {


         //   selectedIndex = MainFrame.getInstance().getDesktop().getTabbedPane().getSelectedIndex();
         //MainFrame.getInstance().getDesktop().getTabbedPane().setTitleAt(selectedIndex, String.valueOf(textArea));

        }


}
