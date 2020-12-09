package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CloseDiagramAction extends AbstractRudokAction {
    @Override
    public void actionPerformed(ActionEvent e) {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/closeDiagram.png"));
        putValue(NAME, "Close diagram");
        putValue(SHORT_DESCRIPTION, "Close diagram");
    }

    public CloseDiagramAction() {
    }
}
