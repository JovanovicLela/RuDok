package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.Slot;
import dsw.rudok.app.repository.Workspace;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.net.URL;

public class RuTreeCellRenderer extends DefaultTreeCellRenderer {

    public RuTreeCellRenderer() {

    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

        if (((RuTreeItem) value).getNodeModel() instanceof Workspace) {
            URL imageURL = getClass().getResource("images/workspace.png");
            Icon icon = null;
            if (imageURL != null)
                icon = new ImageIcon(imageURL);
            setIcon(icon);
        } else if (((RuTreeItem) value).getNodeModel() instanceof Project) {
            URL imageURL = getClass().getResource("images/project.png");
            Icon icon = null;
            if (imageURL != null)
                icon = new ImageIcon(imageURL);
            setIcon(icon);
        }else if (((RuTreeItem) value).getNodeModel() instanceof Slot) {
            URL imageURL = getClass().getResource("images/slot.png");
            Icon icon = null;
            if (imageURL != null)
                icon = new ImageIcon(imageURL);
            setIcon(icon);
        }
        else if (((RuTreeItem) value).getNodeModel() instanceof Document) {
            URL imageURL = getClass().getResource("images/doc.png");
            Icon icon = null;
            if (imageURL != null)
                icon = new ImageIcon(imageURL);
            setIcon(icon);
        }
        return this;
    }

}