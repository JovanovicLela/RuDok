package dsw.rudok.app.repository;

import dsw.rudok.app.repository.slot.SlotModel;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class Diagram implements TreeNode {

    private  String name;
    private SlotModel model = new SlotModel();


    public Diagram(String diagramName) {
        name = diagramName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SlotModel getModel() {
        return model;
    }

    public void setModel(SlotModel model) {
        this.model = model;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return null;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public TreeNode getParent() {
        return null;
    }

    @Override
    public int getIndex(TreeNode node) {
        return 0;
    }

    @Override
    public boolean getAllowsChildren() {
        return false;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Enumeration<? extends TreeNode> children() {
        return null;
    }
}
