package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JMenuBar {

    public MyMenuBar(){
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        fileMenu.setMnemonic(KeyEvent.VK_F);

        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewPageAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewSlotAction());
        fileMenu.addSeparator();
        fileMenu.add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
        editMenu.add(MainFrame.getInstance().getActionManager().getRenameAction());
        editMenu.add(MainFrame.getInstance().getActionManager().getcLoseTab());
        editMenu.add(MainFrame.getInstance().getActionManager().getCloseAllTabs());
        editMenu.add(MainFrame.getInstance().getActionManager().getDeleteNodeAction());
        fileMenu.addSeparator();
        fileMenu.add(MainFrame.getInstance().getActionManager().getExitAction());


        JMenu aboutMenu = new JMenu("About");
        aboutMenu.setMnemonic(KeyEvent.VK_A);
        aboutMenu.add(MainFrame.getInstance().getActionManager().getAboutAction());

        this.add(fileMenu);
        this.add(editMenu);
        this.add(aboutMenu);
    }
}
