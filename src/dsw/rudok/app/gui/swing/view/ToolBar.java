package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class ToolBar extends JToolBar {

    public ToolBar(){
        super(HORIZONTAL);
        setFloatable(false);

        add (MainFrame.getInstance().getActionManager().getExitAction());
        addSeparator();
        add (MainFrame.getInstance().getActionManager().getNewProjectAction());
        add(MainFrame.getInstance().getActionManager().getNewDocumentAction());
        add(MainFrame.getInstance().getActionManager().getNewPageAction());
        add(MainFrame.getInstance().getActionManager().getNewSlotAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getcLoseTab());
        addSeparator();
        add (MainFrame.getInstance().getActionManager().getAboutAction()) ;


    }
}
