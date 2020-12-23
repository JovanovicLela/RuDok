package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TileHorizontallyAction extends AbstractRudokAction{

    public TileHorizontallyAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/horizontal.png"));
        putValue(NAME, "Tile Horizontally");
        putValue(SHORT_DESCRIPTION, "Tile Horizontally");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
