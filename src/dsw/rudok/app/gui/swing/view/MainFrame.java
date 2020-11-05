package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.controller.ActionManager;
import dsw.rudok.app.gui.swing.observer.Subject;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.view.RuTreeImplementation;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class MainFrame extends JFrame{

    private static  MainFrame instance = null;
    private ActionManager actionManager;
    private AboutDialog aboutDialog;
    private Repository documentRepository;
    private RuTree tree;
    private JToolBar toolBar;
    private JTree workspaceTree;
    private ProjectPanel desktop;
    private JMenuBar menu;
    private Subject subject = new Subject();
    private MainFrame(){

    }
    private void initialise(){
        actionManager = new ActionManager();
    }

    public void initialiseWorkspaceTree(){
        tree = new RuTreeImplementation();
        workspaceTree = tree.generateTree(documentRepository.getWorkspace());
        initialiseGUI();
    }
    private void initialiseGUI(){

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight =  screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2,screenHeight / 2);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("RuDok app");

        menu = new MyMenuBar();
        setJMenuBar(menu);

        toolBar = new ToolBar();
        add(toolBar, BorderLayout.NORTH);

        desktop = new ProjectPanel();

        aboutDialog = new AboutDialog();
        setAboutDialog(aboutDialog);

        JScrollPane scroll = new JScrollPane(workspaceTree);
        scroll.setMinimumSize(new Dimension(200,150));
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scroll,desktop);
        getContentPane().add(split,BorderLayout.CENTER);
        split.setDividerLocation(250);
        split.setOneTouchExpandable(true);



    }
    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
            instance.initialise();
        }
        return  instance;
    }

    public ActionManager getActionManager(){
        return actionManager;
    }
    public void setDocumentRepository(Repository documentRepository) {
        this.documentRepository = documentRepository;
    }
    public JTree getWorkspaceTree(){
        return workspaceTree;
    }
    public void setWorkspaceTree(JTree workspaceTree) {
        this.workspaceTree = workspaceTree;
    }
    public RuTree getTree(){
        return tree;
    }
    public Subject getSubject(){return subject;}
}
