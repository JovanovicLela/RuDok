package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.tree.controller.RuTreeCellEditor;
import dsw.rudok.app.gui.swing.tree.controller.RuTreeMouseListener;
import dsw.rudok.app.gui.swing.tree.controller.RuTreeSelectionListener;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class RuTreeView extends JTree {

    public RuTreeView(DefaultTreeModel defaultTreeModel){
        setModel(defaultTreeModel);
        RuTreeCellRenderer ruTreeCellRenderer = new RuTreeCellRenderer();

        addTreeSelectionListener(new RuTreeSelectionListener());
        addMouseListener(new RuTreeMouseListener());
        setCellEditor(new RuTreeCellEditor(this, ruTreeCellRenderer));
        setCellRenderer(ruTreeCellRenderer);
        setEditable(true);
    }

}
