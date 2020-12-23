package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CloseAllSlotsAction extends AbstractRudokAction{
    @Override
    public void actionPerformed(ActionEvent e) {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/closeAllDiagrams.png"));
        putValue(NAME, "Close all diagrams");
        putValue(SHORT_DESCRIPTION, "Close all diagrams");
    }

    public CloseAllSlotsAction() {
    }
}
