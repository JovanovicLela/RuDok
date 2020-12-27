package dsw.rudok.app.gui.swing.tree.view;

import dsw.rudok.app.gui.swing.tree.controller.RuTreeCellEditor;
import dsw.rudok.app.gui.swing.tree.controller.RuTreeMouseListener;
import dsw.rudok.app.gui.swing.tree.controller.RuTreeSelectionListener;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.beans.PropertyVetoException;

public class RuTreeView extends JTree implements TreeSelectionListener {

    public RuTreeView(DefaultTreeModel defaultTreeModel){
        setModel(defaultTreeModel);
        RuTreeCellRenderer ruTreeCellRenderer = new RuTreeCellRenderer();

        addTreeSelectionListener(new RuTreeSelectionListener());
        addMouseListener(new RuTreeMouseListener());
        setCellEditor(new RuTreeCellEditor(this, ruTreeCellRenderer));
        setCellRenderer(ruTreeCellRenderer);
        setEditable(true);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {

        TreePath path = e.getPath();
        for(int i = 0; i < path.getPathCount(); i++){
            if(path.getPathComponent(i) instanceof Slot){

                Slot d = (Slot) path.getPathComponent(i);

                JInternalFrame[] jif = MainFrame.getInstance().getDesktopPane().getAllFrames();

                for(int j = 0; j < jif.length; j++){

                    if(jif[i].getName().equals(d.getName())){
                        try {
                            jif[j].setSelected(true);

                        }catch (PropertyVetoException ex){
                            ex.printStackTrace();
                        }
                    }
                }
            }
        }








    }


}
