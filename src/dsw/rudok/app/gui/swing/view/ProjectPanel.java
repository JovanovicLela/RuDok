package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;


import javax.swing.*;
import java.awt.*;

public class ProjectPanel extends JPanel {

    private  JLabel projectNameLabel = new JLabel();
    private JTabbedPane tabbedPane = new JTabbedPane();
    private Project openedProject = null;

    public ProjectPanel(){
        setLayout(new BorderLayout());
        add(projectNameLabel);
        add(tabbedPane);

    }

    public void setProjectName(String projectName) {
        projectNameLabel.setText(projectName);
    }

}
