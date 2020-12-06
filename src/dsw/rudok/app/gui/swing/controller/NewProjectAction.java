package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.AppCore;
import dsw.rudok.app.gui.swing.errorHandler.ErrorType;
import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class NewProjectAction extends  AbstractRudokAction{

    public NewProjectAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/newProject.png"));
        putValue(NAME,"New Project");
        putValue(SHORT_DESCRIPTION, "New Project");

    }
    //override
    public void actionPerformed(ActionEvent e) {


        Workspace workspace = MainFrame.getInstance().getDocumentRepository().getWorkspace();
        RuNode ws = MainFrame.getInstance().getTree().getSelectedRuNode();
        if(ws == null)
            AppCore.getInstance().getError().onError(ErrorType.NOTHING_SELECTED);

        Project p = new Project("Project "+ (workspace.getChildren().size()+1), ws);
        MainFrame.getInstance().getTree().addProject(p);
    }
}
