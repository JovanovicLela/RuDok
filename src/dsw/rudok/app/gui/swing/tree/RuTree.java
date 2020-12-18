package dsw.rudok.app.gui.swing.tree;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.*;
import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;

public interface RuTree {

    JTree generateTree(Workspace workspace);

    RuNode getSelectedRuNode();
    RuTreeItem getRuTreeItemForPage(Page page);// novo
    RuTreeItem getRuTreeItemForDocument(Document document);//novo


    void addProject(Project project);
    void addDocument(Project project, Document document);
    void addPage(Document document, Page page);
    void addSlot(Page page, Slot slot);

    void deleteProject(Project project);
    void deleteDocument(Project project, Document document);
    void deletePage(Document document, Page page);
    void deleteSlot(Page page, Slot slot);


}
