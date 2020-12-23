package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

public class CascadePageAction extends AbstractRudokAction{

    public CascadePageAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/cascade.png"));
        putValue(NAME, "Cascade");
        putValue(SHORT_DESCRIPTION, "Cascade");
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        int size = MainFrame.getInstance().getDesktopPane().getAllFrames().length;
        JInternalFrame[] frames = MainFrame.getInstance().getDesktopPane().getAllFrames();

        for(int i = 0; i < size; i++){
            frames[i].setLocation(30 + i*40, 30 + i*40);
            try{
                frames[i].setSelected(true);
            }catch (PropertyVetoException e1){
                e1.printStackTrace();
            }
        }

    }
}
