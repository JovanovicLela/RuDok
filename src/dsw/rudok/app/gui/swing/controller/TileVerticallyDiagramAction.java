package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TileVerticallyDiagramAction extends AbstractRudokAction{

    public TileVerticallyDiagramAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/vertical.png"));
        putValue(NAME, "Tile Vertically");
        putValue(SHORT_DESCRIPTION, "Tile Vertically");


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
