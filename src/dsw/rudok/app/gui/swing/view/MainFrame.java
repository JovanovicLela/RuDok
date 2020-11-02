package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.view.images.AboutDialog;
import lombok.Data;

import javax.swing.*;

@Data
public class MainFrame {

    private static  MainFrame instance = null;
    private AboutDialog aboutDialog;
    private Repository documentRepository;
    private RuTree tree;
    private JTree workspaceTree;

    private MainFrame(){

    }


    public void setDocumentRepository(Repository documentRepository) {
    }

    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
        }
        return  instance;
    }
}
