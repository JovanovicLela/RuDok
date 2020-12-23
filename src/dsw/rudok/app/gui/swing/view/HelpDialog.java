package dsw.rudok.app.gui.swing.view;

import javax.swing.*;
import java.awt.*;

public class HelpDialog extends JDialog {

    JPanel panel = new JPanel();
    JPanel pnHelp = new JPanel();
    JPanel pnNewProject = new JPanel();
    JPanel pnNewDoc = new JPanel();
    JPanel pnNewPage = new JPanel();
    JPanel pnOpen = new JPanel();
    JPanel pnSave = new JPanel();
    JPanel pnSaveAs = new JPanel();
    JPanel pnCloseTab = new JPanel();
    JPanel pnCloseAllTabs = new JPanel();
    JPanel pnSelect = new JPanel();
    JPanel pnExit = new JPanel();

    JLabel lblHelp;
    JLabel lblNewProject;
    JLabel lblNewDoc;
    JLabel lblNewPage;
    JLabel lblOpen;
    JLabel lblSave;
    JLabel lblSaveAs;
    JLabel lblCloseTab;
    JLabel lblCloseAllTabs;
    JLabel lblSelect;
    JLabel lblExit;

    JLabel picLblHelp;
    JLabel picLblNewProject;
    JLabel picLblNewDoc;
    JLabel picLblNewPage;
    JLabel picLblOpen;
    JLabel picLblSave;
    JLabel picLblSaveAs;
    JLabel picLblCloseTab;
    JLabel picLblCloseAllTabs;
    JLabel picLblSelect;
    JLabel picLblExit;

    public HelpDialog() {

        setTitle("Help");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = dimension.height;
        int screenWidth = dimension.width;
        setSize(screenWidth / 4, screenHeight / 2);
        setLocationRelativeTo(null);
        setVisible(false);
        setResizable(false);

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        lblHelp = new JLabel("Help - Shift+H");
        lblNewProject = new JLabel("New project - Ctrl+N");
        lblNewDoc = new JLabel("New document - Alt+D");
        lblNewPage = new JLabel("New page - Alt+P");
        lblOpen = new JLabel("Open project - Alt+O");
        lblSave = new JLabel("Save project - Ctrl+S");
        lblSaveAs = new JLabel("Save as - Ctrl+Shift+S");
        lblCloseTab = new JLabel("Close tab - Ctrl+W");
        lblCloseAllTabs = new JLabel("Close all tabs - Ctrl+T");
        lblSelect = new JLabel("Hand cursor(select) - Ctrl+Enter");
        lblExit = new JLabel("Exit program - Alt+Escape");


        picLblHelp = new JLabel(new ImageIcon("src/actions/images/help.png"));
        picLblNewProject = new JLabel(new ImageIcon("src/actions/images/newProject.png"));
        picLblNewDoc = new JLabel(new ImageIcon("src/actions/images/newDocument.png"));
        picLblNewPage = new JLabel(new ImageIcon("src/actions/images/newPage.png"));
        picLblOpen = new JLabel(new ImageIcon("src/actions/images/newPage.png"));
        picLblSave = new JLabel(new ImageIcon("src/actions/images/saveP.png"));
        picLblSaveAs = new JLabel(new ImageIcon("src/actions/images/newPage.png"));
        picLblCloseTab = new JLabel(new ImageIcon("src/actions/images/closeTab.png"));
        picLblCloseAllTabs = new JLabel(new ImageIcon("src/actions/images/closeAllTabs.png"));
        picLblSelect = new JLabel(new ImageIcon("src/actions/images/newPage.png"));
        picLblExit = new JLabel(new ImageIcon("src/actions/images/exit.png"));


        add(panel, BorderLayout.CENTER);
    }
}
