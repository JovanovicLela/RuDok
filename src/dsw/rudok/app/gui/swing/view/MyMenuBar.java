package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JMenuBar {

    public MyMenuBar(){

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu windowMenu = new JMenu("Window");
        JMenu aboutMenu = new JMenu("Help");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        windowMenu.setMnemonic(KeyEvent.VK_W);
        aboutMenu.setMnemonic(KeyEvent.VK_A);


        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewPageAction());
        fileMenu.addSeparator();
        fileMenu.add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getSaveAsAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getOpenProjectAction());
        fileMenu.addSeparator();
        fileMenu.add(MainFrame.getInstance().getActionManager().getExitAction());

        editMenu.add(MainFrame.getInstance().getActionManager().getRenameAction());
        editMenu.add(MainFrame.getInstance().getActionManager().getcLoseTab());
        editMenu.add(MainFrame.getInstance().getActionManager().getCloseAllTabs());
        editMenu.add(MainFrame.getInstance().getActionManager().getDeleteNodeAction());

        windowMenu.add(MainFrame.getInstance().getActionManager().getCascadeDiagramAction());
        windowMenu.add(MainFrame.getInstance().getActionManager().getTileHorizontallyDiagramAction());
        windowMenu.add(MainFrame.getInstance().getActionManager().getTileVerticallyDiagramAction());
        windowMenu.addSeparator();
        windowMenu.add(MainFrame.getInstance().getActionManager().getDeleteElementAction());
        windowMenu.add(MainFrame.getInstance().getActionManager().getCloseAllDiagramAction());

        aboutMenu.add(MainFrame.getInstance().getActionManager().getAboutAction());
        aboutMenu.add(MainFrame.getInstance().getActionManager().getHelpAction());

        this.add(fileMenu);
        this.add(editMenu);
        this.add(windowMenu);
        this.add(aboutMenu);

    }
}
