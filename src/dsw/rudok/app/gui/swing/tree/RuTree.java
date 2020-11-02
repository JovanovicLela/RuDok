package dsw.rudok.app.gui.swing.tree;

import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;

import javax.swing.*;

public interface RuTree {

    JTree generateTree(Workspace workspace);
    void addProject(Project project);
}
