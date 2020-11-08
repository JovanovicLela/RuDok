package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class CLoseTab extends AbstractRudokAction implements Observer {

    public CLoseTab(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        //putValue((SMALL_ICON, loadIcon());
        putValue(NAME, "Ugasi tab");
        putValue(SHORT_DESCRIPTION, "Gasi selektovan tab");
    }



    @Override
    public void update() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
