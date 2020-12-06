package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.*;


public class ProjectPanel extends JPanel implements Observer {


    private  JLabel projectNameLabel = new JLabel();
    private JTabbedPane tabbedPane = new JTabbedPane();
    private Project openedProject = null;



    public ProjectPanel(){
        setLayout(new BorderLayout());
        add(projectNameLabel);
        add(tabbedPane);
        MainFrame.getInstance().getSubject().attach(this);

    }


    public void preview(){
        if(openedProject == null){
            return;
        }
        setProjectName(openedProject.getName());
        setTabbedPane(openedProject);
    }

    private  void setTabbedPane(Project project){
        tabbedPane.removeAll();

        for(RuNode ruNodeDoc: project.getChildren()){
            Document document = (Document) ruNodeDoc;
            tabbedPane.setFont( new Font( "Dialog", Font.BOLD|Font.ITALIC, 12 ) );
            tabbedPane.add(project.getName() + " - " + document.getName(), new DocumentPanel(project.getName(), document));

        }

    }


    public void setProjectName(String projectName) {
        projectNameLabel.setText(projectName);
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public void setOpenedProject(Project openedProject) {
        this.openedProject = openedProject;
    }
    @Override
    public void update() {
        preview();
    }
}

