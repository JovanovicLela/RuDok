package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Page;
import dsw.rudok.app.repository.node.RuNode;

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
    public void actionPerformed(ActionEvent e) {

        RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();

        if((selectedRuNode == null) || !(selectedRuNode instanceof  Document)){
            return;
        }
        Document selectedDocument = (Document) selectedRuNode;
        Page page = new Page("Page: "+ (selectedDocument.getChildren().size() + 1), selectedDocument);
        MainFrame.getInstance().getTree().addPage(selectedDocument, page);
     //   MainFrame.getInstance().getSubject().notifyAllObservers();
/*

        Project p=new Project(" ");
        MainFrame.getInstance().getWorkspaceTree().addProject(p);
        Diagram d=new Diagram(" ");
        p.addDiagram(d);



        DiagramView view=new DiagramView();
        view.setDiagram(d);
        AppCore.getInstance().getDesktop().add(view);
*/

       /* try {
            view.setSelected(true);
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/




    }

    @Override
    public void update() {
        if(MainFrame.getInstance().getTree().getSelectedRuNode() instanceof Document) {
            setEnabled(true);
        }else {
            setEnabled(false);
        }
    }
}
