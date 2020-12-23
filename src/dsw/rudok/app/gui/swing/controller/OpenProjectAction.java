package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.AppCore;
import dsw.rudok.app.gui.swing.errorHandler.ErrorType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class OpenProjectAction  extends  AbstractRudokAction{

    public OpenProjectAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_O, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/open.png"));
        putValue(NAME, "Open project");
        putValue(SHORT_DESCRIPTION, "Open project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        final JFileChooser fc = new JFileChooser();
        if(fc.showOpenDialog(null) == 1) return;
        File file = fc.getSelectedFile();
        if(file == null){
            AppCore.getInstance().getError().onError(ErrorType.NOTHING_SELECTED);
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            Object obj = in.readObject();


        }catch (FileNotFoundException a){
            a.printStackTrace();
        }catch (IOException b){
            b.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
