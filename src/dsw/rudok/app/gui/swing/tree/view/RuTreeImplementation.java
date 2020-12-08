package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.*;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class RuTreeImplementation implements RuTree {

    private RuTreeView treeView;
    private DefaultTreeModel treeModel;

    @Override
    public JTree generateTree(Workspace workspace){
        RuTreeItem root = new RuTreeItem(workspace);
        treeModel = new DefaultTreeModel(root);
        treeView = new RuTreeView(treeModel);
        return treeView;
    }

    @Override
    public RuNode getSelectedRuNode() {
        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return  null;
        return  selectedItem.getNodeModel();
    }

 /*Override
   public Project getCurrentProject() {

            TreePath path = treeView.getSelectionPath();
            for(int i = 0; i < path.getPathCount(); i++){
                if(path.getPathComponent(i) instanceof  Project){
                    return  (Project) path.getPathComponent(i);
                }
            }
            return  null;
        }//novo*/


    @Override
    public void addProject(Project project){
        RuNode nodeModel =((RuTreeItem)treeModel.getRoot()).getNodeModel();
        ((RuTreeItem)treeModel.getRoot()).add(new RuTreeItem(project));
        ((Workspace)nodeModel).addChild(project);
        SwingUtilities.updateComponentTreeUI(treeView);

    }

    @Override
    public void addDocument(Project project, Document document) {

        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.add(new RuTreeItem(document));
        project.addChild(document);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void addPage(Document document, Page page) {

        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.add(new RuTreeItem(page));
        document.addChild(page);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void addSlot(Page page, Slot slot) {
        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.add(new RuTreeItem(slot));
        page.addChild(slot);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void deleteProject(Project project) {
        RuNode nodeModel =((RuTreeItem)treeModel.getRoot()).getNodeModel();
        ((RuTreeItem)treeModel.getRoot()).add(new RuTreeItem(project));
        ((Workspace)nodeModel).removeChild(project);
        SwingUtilities.updateComponentTreeUI(treeView);

    }

    @Override
    public void deleteDocument(Project project, Document document) {
        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.add(new RuTreeItem(document));
        project.removeChild(document);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void deletePage(Document document, Page page) {
        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.add(new RuTreeItem(page));
        document.removeChild(page);
        SwingUtilities.updateComponentTreeUI(treeView);

    }

    @Override
    public void deleteSlot(Page page, Slot slot) {
        RuTreeItem selectedItem = getSelectedRuTreeItem();
        if(selectedItem == null)
            return;
        selectedItem.remove(new RuTreeItem(slot));
        page.removeChild(slot);
        SwingUtilities.updateComponentTreeUI(treeView);

    }

    private  RuTreeItem getSelectedRuTreeItem(){
        Object obj = treeView.getLastSelectedPathComponent();
        if((obj == null)  || !(obj instanceof  RuTreeItem))
            return  null;
        return (RuTreeItem) obj;
    }


}
