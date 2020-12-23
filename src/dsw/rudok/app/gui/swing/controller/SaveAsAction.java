package dsw.rudok.app.gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveAsAction extends AbstractRudokAction {

    public SaveAsAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("control shift S"));
        putValue(SMALL_ICON, loadIcon("images/saveAs.png"));
        putValue(NAME, "Save as");
        putValue(SHORT_DESCRIPTION, "Save project as");

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
