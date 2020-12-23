package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewPageAction extends  AbstractRudokAction {

    public NewPageAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/newPage.png"));
        putValue(NAME, "New Page");
        putValue(SHORT_DESCRIPTION, "New Page");


    }


    @Override
    public void actionPerformed(ActionEvent e) {



        RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();

        if((selectedRuNode == null) || !(selectedRuNode instanceof  Document)){
            return;
        }
       else if(selectedRuNode instanceof Document) {
            setEnabled(true);
        }else {
            setEnabled(false);
        }
        Document selectedDocument = (Document) selectedRuNode;
        Page page = new Page("Page: "+ (selectedDocument.getChildren().size() + 1), selectedDocument);
        MainFrame.getInstance().getTree().addPage(selectedDocument, page);


    }

}
