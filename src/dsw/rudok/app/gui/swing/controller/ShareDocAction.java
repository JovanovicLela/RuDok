package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.gui.swing.view.ShareDocument;
import dsw.rudok.app.repository.Document;

import javax.swing.*;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class ShareDocAction  extends  AbstractRudokAction{

    public ShareDocAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveW.png"));
        putValue(NAME, "Share document");
        putValue(SHORT_DESCRIPTION, "Share document");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<Document> documents = new ArrayList<>();

        TreePath tree[] = MainFrame.getInstance().getWorkspaceTree().getSelectionPaths();
        Object o = MainFrame.getInstance().getTree().getSelectedRuNode();

        if(tree == null) {
            JOptionPane.showMessageDialog(null, "Select document", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(!(o instanceof Document)) {
            JOptionPane.showMessageDialog(null, "Select document", "Error", JOptionPane.WARNING_MESSAGE);
        }
            try {
                for (TreePath treePath : tree) {
                    int j = 0;
                    while (j < treePath.getPathCount()) {
                        if (treePath.getPathComponent(j) instanceof Document) {
                            documents.add((Document) treePath.getPathComponent(j));
                        }
                        j++;
                    }
                }
            }
            catch (NullPointerException e1){
                JOptionPane.showMessageDialog(null, "Select document", "Error", JOptionPane.ERROR_MESSAGE);
            }
            ShareDocument shareDialog = new ShareDocument(MainFrame.getInstance(), documents);
            shareDialog.setVisible(true);


        }
}
