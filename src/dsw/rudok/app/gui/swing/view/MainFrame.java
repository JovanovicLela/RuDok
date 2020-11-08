package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.controller.ActionManager;
import dsw.rudok.app.gui.swing.observer.Subject;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.view.RuTreeImplementation;
import javafx.scene.control.ScrollBar;


import javax.swing.*;
import java.awt.*;

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
    private Subject subject = new Subject(); //observer pattern

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

        desktop = new ProjectPanel(); // vec dodato

        aboutDialog = new AboutDialog();

        JScrollPane scroll = new JScrollPane(workspaceTree);


        scroll.setMinimumSize(new Dimension(200, 150));
        scroll.setVerticalScrollBarPolicy(22);
        scroll.setVisible(true);

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, desktop);
        split.setVisible(true);

        getContentPane().add(split,  BorderLayout.CENTER);

        split.setDividerLocation(250);
        split.setOneTouchExpandable(true);

        setLocationRelativeTo(null);

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

    public static void setInstance(MainFrame instance) {
        MainFrame.instance = instance;
    }

    public void setActionManager(ActionManager actionManager) {
        this.actionManager = actionManager;
    }

    public AboutDialog getAboutDialog() {
        return aboutDialog;
    }

    public void setAboutDialog(AboutDialog aboutDialog) {
        this.aboutDialog = aboutDialog;
    }

    public Repository getDocumentRepository() {
        return documentRepository;
    }

    public void setTree(RuTree tree) {
        this.tree = tree;
    }

    public JToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(JToolBar toolBar) {
        this.toolBar = toolBar;
    }

    public ProjectPanel getDesktop() {
        return desktop;
    }

    public void setDesktop(ProjectPanel desktop) {
        this.desktop = desktop;
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
