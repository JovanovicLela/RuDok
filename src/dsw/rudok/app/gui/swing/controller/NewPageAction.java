package dsw.rudok.app.gui.swing.controller;

import com.sun.tools.javac.Main;
import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Document;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewPageAction extends  AbstractRudokAction implements Observer {

    public NewPageAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/newPage.png"));
        putValue(NAME, "New Page");
        putValue(SHORT_DESCRIPTION, "New Page");

        setEnabled(false);
        MainFrame.getInstance().getSubject().attach(this);
    }

    @Override
    public void update() {
        if(MainFrame.getInstance().getTree().getSelectedRuNode() instanceof Document){
            setEnabled(true);
        }
        setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//nesto
        System.out.println("Bilo sta");
        System.out.println(" sta");
        System.out.println("Bilo sta");
        System.out.println("Bilo sta");
        System.out.println("Bilo sta");
        System.out.println("Bilo sta");
        System.out.println("Bilo sta");
        System.out.println("Bilo sta");



    }
}
