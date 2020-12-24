package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ExitAction extends  AbstractRudokAction {
    public ExitAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/exit.png"));
        putValue(NAME, "Exit");
        putValue(SHORT_DESCRIPTION, "Exit");

    }


    @Override
    public void actionPerformed(ActionEvent e) {

                Object[] opcije;
                opcije = new Object[]{"Cancel", "Exit"};

                int odgovor = JOptionPane.showOptionDialog(MainFrame.getInstance(), "Do you want to exit workspace?", "Confirm exit",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcije, opcije[1]);
                if (odgovor == JOptionPane.YES_OPTION) {
                    MainFrame.getInstance().setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
                if (odgovor == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }



    }}