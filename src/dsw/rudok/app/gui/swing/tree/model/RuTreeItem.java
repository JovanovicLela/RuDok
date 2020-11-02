package dsw.rudok.app.gui.swing.tree.model;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;
import lombok.Data;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.Iterator;

@Data

public class RuTreeItem extends DefaultMutableTreeNode{

    private  String name;
    private RuNode nodeModel;

    public RuTreeItem(RuNode nodeModel) {
        this.nodeModel = nodeModel;
        this.name = nodeModel.getName();
    }

    public RuTreeItem(String name, RuNode nodeModel) {
        this.name = name;
        this.nodeModel = nodeModel;
    }

    @Override
    public boolean isLeaf() {
        return super.isLeaf();
    }

    @Override
    public int getIndex(TreeNode node) {
        return findIndexByChild((RuTreeItem) node);
    }

    private int findIndexByChild(RuTreeItem node) {
        if(this.nodeModel instanceof  RuNodeComposite){
            return  ((RuNodeComposite) this.nodeModel).getChildren().indexOf(node.getNodeModel());
        }
        return  -1;
    }


    private TreeNode findIndexByChild(int childIndex) {

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
    public TreeNode getChildAt(int index) {
        return super.getChildAt(index);
    }

    @Override
    public int getChildCount() {
        return super.getChildCount();
    }

    @Override
    public boolean getAllowsChildren() {
        return super.getAllowsChildren();
    }

    @Override
    public Enumeration<TreeNode> children() {
        return super.children();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RuTreeItem that = (RuTreeItem) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return nodeModel != null ? nodeModel.equals(that.nodeModel) : that.nodeModel == null;
    }

    @Override
    public String toString() {
        return name;
    }
}
