package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.controller.ActionManager;
import dsw.rudok.app.gui.swing.errorHandler.ErrorHandler;
import dsw.rudok.app.gui.swing.errorHandler.MyError;
import dsw.rudok.app.gui.swing.observer.Subject;
import dsw.rudok.app.gui.swing.tree.RuTree;
import dsw.rudok.app.gui.swing.tree.view.RuTreeImplementation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame  {

    private static  MainFrame instance = null;

    private ActionManager actionManager;

    private AboutDialog aboutDialog;
    private JToolBar toolBar;
    private ProjectPanel desktop;
    private JMenuBar menu;
    private Palette palette;
    private JDesktopPane desktopPane;

    private Repository documentRepository;
    private RuTree tree;
    private JTree workspaceTree;

    private ErrorHandler error;
    private Subject subject = new Subject(); //observer pattern


    private MainFrame(){
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
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

            }
        });
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
        setTitle("RuDok");


        menu = new MyMenuBar();
        setJMenuBar(menu);

        toolBar = new ToolBar();
        add(toolBar, BorderLayout.NORTH);

        palette = new Palette();
        getContentPane().add(palette, BorderLayout.EAST);

        desktop = new ProjectPanel();
        desktopPane = new JDesktopPane();

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

        ImageIcon img = new ImageIcon(getClass().getResource("images/layer32-min.png"));
        this.setIconImage(img.getImage());

        setLocationRelativeTo(null);


    }
    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
            instance.initialise();
        }
        return  instance;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
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

    public ErrorHandler getError() {
        return error;
    }

    public void setError(ErrorHandler error) {
        this.error = error;
    }

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

  public void showError(MyError message){
      JOptionPane.showMessageDialog(null, message.getMessage());
    }
}