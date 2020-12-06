package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class DeleteNodeAction extends AbstractRudokAction implements Observer {

    public DeleteNodeAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/delete.png"));
        putValue(NAME, "Delete");
        putValue(SHORT_DESCRIPTION, "Deletes selected node");

        MainFrame.getInstance().getSubject().attach(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        RuNode selectedNode = MainFrame.getInstance().getTree().getSelectedRuNode();

        if(selectedNode instanceof  Project) {
            Project selectedProject = (Project) selectedNode;
            MainFrame.getInstance().getTree().deleteProject(selectedProject);
        }else if(selectedNode instanceof Document) {
            Document selectedDoc = (Document) selectedNode;
            MainFrame.getInstance().getTree().deleteDocument((Project) selectedDoc.getParent(), selectedDoc);
        }
    }

    @Override
    public void update() {
    }
}
