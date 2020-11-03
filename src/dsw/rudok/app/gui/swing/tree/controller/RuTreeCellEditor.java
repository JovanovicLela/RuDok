package dsw.rudok.app.gui.swing.tree.controller;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.repository.Workspace;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.EventObject;

public class RuTreeCellEditor extends DefaultTreeCellEditor implements ActionListener {

    private  Object clickedOn = null;
    private JTextField edit = null;

    public RuTreeCellEditor(JTree tree, DefaultTreeCellRenderer renderer) {
        super(tree, renderer);
    }

    public Component getTreeCellEditorComponent(JTree arg0, Object arg1, boolean arg2, boolean arg3, boolean arg4, int arg5){
        clickedOn = arg1;
        edit = new JTextField(arg1.toString());
        edit.addActionListener(this);
        return  edit;
    }

    @Override
    public boolean isCellEditable(EventObject event) {
        if(event instanceof MouseEvent)
            if(((MouseEvent)event).getClickCount()==3){
                return  true;
            }
        return  false;
    }

    public  void actionPerformed(ActionEvent e){

        if(!(clickedOn instanceof RuTreeItem))
            return;
        RuTreeItem clicked = (RuTreeItem) clickedOn;

        if(clicked.getNodeModel() instanceof Workspace){
            clicked.setName(e.getActionCommand());
            ((Workspace) clicked.getNodeModel()).setName(e.getActionCommand());
        }
        else {
            ((Workspace) clicked.getNodeModel()).setName(e.getActionCommand());
        }


    }
}
