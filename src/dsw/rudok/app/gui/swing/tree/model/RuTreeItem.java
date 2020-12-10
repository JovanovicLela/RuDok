package dsw.rudok.app.gui.swing.tree.model;

import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.Iterator;

public class RuTreeItem extends DefaultMutableTreeNode{

    private  String name;
    private RuNode nodeModel;

    public RuTreeItem(RuNode nodeModel) {
        this.nodeModel = nodeModel;
        this.name = nodeModel.getName();
    }
    public void addProject(Project project){
        ((Workspace)getRoot()).addProject(project);
    }


    public RuTreeItem(String name, RuNode nodeModel) {
        this.name = name;
        this.nodeModel = nodeModel;
    }


    @Override
    public TreeNode getChildAt(int childIndex) {
        return findChildByIndex(childIndex);
    }
    @Override
    public int getIndex(TreeNode node) {
        return findIndexByChild((RuTreeItem) node);
    }

    @Override
    public int getChildCount() {
        if(nodeModel instanceof  RuNodeComposite)
            return  ((RuNodeComposite) nodeModel).getChildren().size();
        return  0;
    }
    @Override
    public boolean getAllowsChildren() {
        if(nodeModel instanceof  RuNodeComposite)
            return true;
        return  false;
    }

    @Override
    public Enumeration children() {
        if(nodeModel instanceof  RuNodeComposite)
            return  (Enumeration) ((RuNodeComposite) nodeModel).getChildren();
        return  null;
    }
    @Override
    public boolean isLeaf() {
        if(nodeModel instanceof  RuNodeComposite)
            return false;
        return  true;
    }

    private int findIndexByChild(RuTreeItem node) {
        if(this.nodeModel instanceof  RuNodeComposite){
            return  ((RuNodeComposite) this.nodeModel).getChildren().indexOf(node.getNodeModel());
        }
        return  -1;
    }


    private TreeNode findChildByIndex(int childIndex) {

        if(nodeModel instanceof RuNodeComposite){
            RuTreeItem toLookFor = new RuTreeItem(((RuNodeComposite) nodeModel).getChildren().get(childIndex));

            Iterator childrenIterator = children.iterator();
            TreeNode current;

            while (childrenIterator.hasNext()){
                current = (TreeNode)childrenIterator.next();
                if(current.equals(toLookFor))
                    return  current;
            }
        }
        return null;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof  RuTreeItem){
            RuTreeItem otherObj = (RuTreeItem) obj;
            return  this.nodeModel.equals(otherObj.nodeModel);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuNode getNodeModel() {
        return nodeModel;
    }

    public void setNodeModel(RuNode nodeModel) {
        this.nodeModel = nodeModel;
    }

    @Override
    public String toString() {
        return name;
    }
}
