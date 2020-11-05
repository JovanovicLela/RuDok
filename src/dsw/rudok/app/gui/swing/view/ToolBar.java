package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class ToolBar extends JToolBar {

    public ToolBar(){
        super(HORIZONTAL);
        setFloatable(false);

        add (MainFrame.getInstance().getActionManager().getExitAction());
        add (MainFrame.getInstance().getActionManager().getNewProjectAction());
        add (MainFrame.getInstance().getActionManager().getAboutAction()) ;

    }
}
