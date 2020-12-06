package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Workspace;

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class RenameAction extends  AbstractRudokAction{




    public RenameAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/renameIcon.png"));
        putValue(NAME, "Rename");
        putValue(SHORT_DESCRIPTION, "Changes name");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = MainFrame.getInstance().getWorkspaceTree().getLeadSelectionPath();

        if(obj == null){
            return;
        }

        Object object = ((TreePath)obj).getLastPathComponent();
        if(object == null || object instanceof Workspace){
            return;
        }
        MainFrame.getInstance().getWorkspaceTree().startEditingAtPath((TreePath)obj);

        }


}
