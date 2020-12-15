package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SaveDiagramAction extends  AbstractRudokAction{

    public SaveDiagramAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveDiagram.png"));
        putValue(NAME, "Save diagram");
        putValue(SHORT_DESCRIPTION, "Save diagram");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(MainFrame.getInstance());

    }
}
