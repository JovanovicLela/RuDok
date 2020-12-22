package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class Palette extends JToolBar {

    public Palette() {

        super(JToolBar.VERTICAL);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(MainFrame.getInstance().getActionManager().getHandCursorAction());

        add(MainFrame.getInstance().getActionManager().getRectangleAction());

        add(MainFrame.getInstance().getActionManager().getTriangleAction());

        add(MainFrame.getInstance().getActionManager().getCircleAction());

        add(MainFrame.getInstance().getActionManager().getRotateAction());

        add(MainFrame.getInstance().getActionManager().getResizeAction());

        add(MainFrame.getInstance().getActionManager().getMoveAction());

        add(MainFrame.getInstance().getActionManager().getDeleteElementAction());

    }
}
