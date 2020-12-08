package dsw.rudok.app.gui.swing.tree;

import dsw.rudok.app.repository.*;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;

public interface RuTree {

    JTree generateTree(Workspace workspace);

    RuNode getSelectedRuNode();
  //  Project getCurrentProject();

    void addProject(Project project);
    void addDocument(Project project, Document document);
    void addPage(Document document, Page page);
    void addSlot(Page page, Slot slot);

    void deleteProject(Project project);
    void deleteDocument(Project project, Document document);
    void deletePage(Document document, Page page);
    void deleteSlot(Page page, Slot slot);


}
