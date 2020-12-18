package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class Palette extends JToolBar {

    public Palette() {

        super(JToolBar.VERTICAL);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(MainFrame.getInstance().getActionManager().getHandCursorAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getRectangleAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getTriangleAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getCircleAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getRotateAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getResizeAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getMoveAction());
        addSeparator();
        add(MainFrame.getInstance().getActionManager().getDeleteElementAction());
        addSeparator();

    }
}
