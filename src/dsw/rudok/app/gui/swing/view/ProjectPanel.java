package dsw.rudok.app.gui.swing.view;

import javax.swing.*;

public class ProjectPanel extends JPanel {

    private  JLabel projectNameLabel = new JLabel();

    public ProjectPanel(){
        add(projectNameLabel);
    }

    public void setProjectName(String projectName) {

        projectNameLabel.setText(projectName);
    }
}
