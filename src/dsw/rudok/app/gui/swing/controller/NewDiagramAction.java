package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewDiagramAction extends  AbstractRudokAction{

    public NewDiagramAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
       // putValue(SMALL_ICON, loadIcon());
        putValue(NAME, "New diagram");
        putValue(SHORT_DESCRIPTION, "New diagram");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
