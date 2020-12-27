package dsw.rudok.app.gui.swing.tree.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.slot.Slot;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import java.beans.PropertyVetoException;

//promena

public class RuTreeSelectionListener implements TreeSelectionListener {

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        /*TreePath path = e.getPath();
        RuTreeItem treeItemSelected = (RuTreeItem)path.getLastPathComponent();
        System.out.println("Selektovan cvor:" + treeItemSelected.getName());
        System.out.println("getPath: " + e.getPath());*/

        TreePath path = e.getPath();

        for(int i=0; i<path.getPathCount(); i++){
            if(path.getPathComponent(i) instanceof Slot){
                Slot d=(Slot)path.getPathComponent(i);

                JInternalFrame[] jif= MainFrame.getInstance().getDesktopPane().getAllFrames();
                for (int j=0;j<jif.length;j++){

                    if (jif[j].getName().equals(d.getName())){
                        try {

                            jif[j].setSelected(true);

                        } catch (PropertyVetoException ex) {
                            // TODO Auto-generated catch block
                            ex.printStackTrace();
                        }
                        break;
                    }

                }

                break;
            }
        }



        MainFrame.getInstance().getSubject().notifyAllObservers();
        // privremeno resenje dok se ne implementira tacka 6
       //if(!"Workspace".equals(treeItemSelected.getName())){
         //   MainFrame.getInstance().getDesktop().setProjectName(treeItemSelected.getName());
        //}

    }
}
