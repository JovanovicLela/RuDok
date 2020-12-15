package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.state.CircleSate;
import dsw.rudok.app.gui.swing.state.RectangleState;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.Slot;
import dsw.rudok.app.repository.SlotCircle;
import dsw.rudok.app.repository.SlotRectangle;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewSlotAction extends  AbstractRudokAction implements Observer {

    public  NewSlotAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/newSlot.png"));
        putValue(NAME, "New Slot");
        putValue(SHORT_DESCRIPTION, "New Slot");

        setEnabled(false);
        MainFrame.getInstance().getSubject().attach(this);
    }


    @Override
    public void update() {
        if (MainFrame.getInstance().getTree().getSelectedRuNode() instanceof Page) {
            setEnabled(true);
        } else {
            setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();

        if((selectedRuNode == null) || !(selectedRuNode instanceof  Page))
            return;

        Page selectedPage = (Page) selectedRuNode;

        Slot slot = null;
        if(MainFrame.getInstance().getStateManager().getCurrentState() instanceof CircleSate){
            slot = new SlotCircle("Slot " + (selectedPage.getChildren().size() + 1), selectedPage, 50, 50, 40, 20);
            MainFrame.getInstance().getTree().addSlot(selectedPage, slot);
        } else if(MainFrame.getInstance().getStateManager().getCurrentState() instanceof RectangleState){
            slot = new SlotRectangle("Slot " + (selectedPage.getChildren().size() + 1), selectedPage, 50, 40, 40, 20);
            MainFrame.getInstance().getTree().addSlot(selectedPage, slot);
        }
    }
}
