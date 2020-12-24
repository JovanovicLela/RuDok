package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.AppCore;
import dsw.rudok.app.gui.swing.errorHandler.ErrorType;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveWorkspaceAction extends AbstractRudokAction{

    public static String WS_EX = ".ws";

    public SaveWorkspaceAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveW.png"));
        putValue(NAME, "Save workspace");
        putValue(SHORT_DESCRIPTION, "Save workspace");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Save workspace");
        jfc.setFileFilter(new WsF());

        Workspace workspace = MainFrame.getInstance().getDocumentRepository().getWorkspace();
        RuNode ws = MainFrame.getInstance().getTree().getSelectedRuNode();
        if(ws == null)
            AppCore.getInstance().getError().onError(ErrorType.NOTHING_SELECTED);

        File file;

        if(jfc.showSaveDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION){
            file = jfc.getSelectedFile();
        }else { return; }

        ObjectOutputStream os;
        try {
            os = new ObjectOutputStream(new FileOutputStream(file.getAbsolutePath()));
            os.writeObject(ws);
        } catch (Exception e1){
            e1.printStackTrace();
        }


    }

    public class WsF extends FileFilter{
        @Override
        public boolean accept(File f) {
            return (f.isDirectory() || f.getName().toLowerCase().endsWith(WS_EX));
        }

        @Override
        public String getDescription() {
            return "Rukovalac dokumentima_WS (" + WS_EX + ")";
        }
    }
}
