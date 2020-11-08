package dsw.rudok.app.gui.swing.tree.controller;

import dsw.rudok.app.gui.swing.tree.model.RuTreeItem;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

//promena

public class RuTreeSelectionListener implements TreeSelectionListener {

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        TreePath path = e.getPath();
        RuTreeItem treeItemSelected = (RuTreeItem)path.getLastPathComponent();
        System.out.println("Selektovan cvor:" + treeItemSelected.getName());
        System.out.println("getPath: " + e.getPath());

        MainFrame.getInstance().getSubject().notifyAllObservers();
        // privremeno resenje dok se ne implementira tacka 6
       //if(!"Workspace".equals(treeItemSelected.getName())){
         //   MainFrame.getInstance().getDesktop().setProjectName(treeItemSelected.getName());
        //}

    }
}
