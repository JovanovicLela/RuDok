package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Project;

import javax.swing.*;
import java.awt.*;

public class ProjectPanel extends JPanel implements Observer {

    private  JLabel projectNameLabel = new JLabel();
    private Project openedProject = null;
    private  JTabbedPane tabbedPane = new JTabbedPane();

    public ProjectPanel(){
        setLayout(new BorderLayout());
        add(projectNameLabel, BorderLayout.NORTH);
        add(tabbedPane);

        MainFrame.getInstance().getSubject().attach(this);
    }

    public void setProjectName(String projectName) {
        projectNameLabel.setText(projectName);
    }


    @Override
    public void update() {

    }
}
