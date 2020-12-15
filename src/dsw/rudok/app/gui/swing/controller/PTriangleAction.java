package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.PageView;
import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class PTriangleAction extends AbstractRudokAction{
    public PTriangleAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/triangle.jpg"));
        putValue(NAME, "Triangle");
        putValue(SHORT_DESCRIPTION, "Triangle");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        PageView dw = null;

        if (MainFrame.getInstance().getWorkspaceTree().isSelectionEmpty())
            return;

      //  ((DiagramView) MainFrame.getInstance().getDesktopPane().)
    }
}
