package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MyMenuBar extends JMenuBar {

    public MyMenuBar(){
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu windowMenu = new JMenu("Window");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        windowMenu.setMnemonic(KeyEvent.VK_W);

        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewPageAction());
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewSlotAction());
        fileMenu.addSeparator();
        fileMenu.add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
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
        windowMenu.add(MainFrame.getInstance().getActionManager().getCloseDiagramAction());
        windowMenu.addSeparator();
        windowMenu.add(MainFrame.getInstance().getActionManager().getCloseAllDiagramAction());

        JMenu aboutMenu = new JMenu("About");
        aboutMenu.setMnemonic(KeyEvent.VK_A);
        aboutMenu.add(MainFrame.getInstance().getActionManager().getAboutAction());

        this.add(fileMenu);
        this.add(editMenu);
        this.add(windowMenu);
        this.add(aboutMenu);

    }
}
