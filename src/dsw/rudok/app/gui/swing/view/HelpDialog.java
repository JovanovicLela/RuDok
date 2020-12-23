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

        setTitle("Shortcuts");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = dimension.height;
        int screenWidth = dimension.width;
        setSize(screenWidth / 4, screenHeight / 3);
        setLocationRelativeTo(null);
        setVisible(false);
        setResizable(true);

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.getHSBColor(0.5f,0.2f,1f));;


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


        picLblHelp = new JLabel(new ImageIcon("images/help.png"));
        picLblNewProject = new JLabel(new ImageIcon("images/newProject.png"));
        picLblNewDoc = new JLabel(new ImageIcon("images/newDocument.png"));
        picLblNewPage = new JLabel(new ImageIcon("src/actions/images/newPage.png"));
        picLblOpen = new JLabel(new ImageIcon("src/actions/images/open.png"));
        picLblSave = new JLabel(new ImageIcon("src/actions/images/saveP.png"));
        picLblSaveAs = new JLabel(new ImageIcon("src/actions/images/saveAs.png"));
        picLblCloseTab = new JLabel(new ImageIcon("src/actions/images/closeTab.png"));
        picLblCloseAllTabs = new JLabel(new ImageIcon("src/actions/images/closeAllTabs.png"));
        picLblSelect = new JLabel(new ImageIcon("src/actions/images/handc.png"));
        picLblExit = new JLabel(new ImageIcon("src/actions/images/exit.png"));

        pnHelp.add(picLblHelp);
        pnHelp.add(lblHelp);

        pnNewProject.add(picLblNewProject);
        pnNewProject.add(lblNewProject);

        pnNewDoc.add(picLblNewDoc);
        pnNewDoc.add(lblNewDoc);

        pnNewPage.add(picLblNewPage);
        pnNewPage.add(lblNewPage);

        pnOpen.add(picLblOpen);
        pnOpen.add(lblOpen);

        pnSave.add(picLblSave);
        pnSave.add(lblSave);

        pnSaveAs.add(picLblSaveAs);
        pnSaveAs.add(lblSaveAs);

        pnCloseTab.add(picLblCloseTab);
        pnCloseTab.add(lblCloseTab);

        pnCloseAllTabs.add(picLblCloseAllTabs);
        pnCloseAllTabs.add(lblCloseAllTabs);

        pnExit.add(picLblExit);
        pnExit.add(lblExit);

        panel.add(pnHelp);
        panel.add(pnNewProject);
        panel.add(pnNewDoc);
        panel.add(pnNewPage);
        panel.add(pnOpen);
        panel.add(pnSave);
        panel.add(pnSaveAs);
        panel.add(pnCloseTab);
        panel.add(pnCloseTab);
        panel.add(pnExit);


        this.add(panel, BorderLayout.CENTER);
    }
}
