package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewDocumentAction extends  AbstractRudokAction   {

    public  NewDocumentAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("images/newDocument.png"));
        putValue(NAME, "New Document");
        putValue(SHORT_DESCRIPTION, "New Document");

    }



    @Override
    public void actionPerformed(ActionEvent e) {


        RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();

        if((selectedRuNode == null) || !(selectedRuNode instanceof Project)) {// ako nije selektovan projekat, nema dodavanja novog Doc
            return;
        }

        if (selectedRuNode instanceof Project) {
            setEnabled(true);
        } else {
            setEnabled(false);
        }


        Project selectedProject = (Project) selectedRuNode;
        Document document = new Document("Document " + (selectedProject.getChildren().size() + 1),selectedProject);
        MainFrame.getInstance().getTree().addDocument(selectedProject, document);



    }
}
