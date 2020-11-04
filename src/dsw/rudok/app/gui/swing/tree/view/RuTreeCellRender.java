package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;

import java.net.URL;
import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;

public class RuTreeCellRender extends DefaultTreeCellRenderer {

//    public RuTreeCellRenderer(){
//    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

        if (((RuTreeItem)value).getNodeModel() instanceof Workspace) {
         URL imageURL = getClass().getResource("image/tdiagram.gif");
         Icon icon = null;
         if(imageURL != null)
             icon = new ImageIcon(imageURL);
         setIcon(icon);

        } else if(((RuTreeItem)value).getNodeModel() instanceof Project){
         URL imageURL = getClass().getResource("image/tproject.gif");
         Icon icon = null;
         if(imageURL != null)
             icon = new ImageIcon(imageURL);
         setIcon(icon);
         }
         return this;
        }
}
