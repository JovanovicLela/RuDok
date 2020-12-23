package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class TileVerticallyAction extends AbstractRudokAction{

    public TileVerticallyAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/vertical.png"));
        putValue(NAME, "Tile Vertically");
        putValue(SHORT_DESCRIPTION, "Tile Vertically");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JInternalFrame[] frames = MainFrame.getInstance().getDesktopPane().getAllFrames();
        Dimension d = MainFrame.getInstance().getDesktopPane().getSize();
        int size = frames.length;
        int height = (int)(d.getHeight() / size);

        for(int i = 0; i < size; i++){
            frames[i].setLocation(0, i*height);
            frames[i].setSize((int) d.getWidth(), height);

        }
    }
}
