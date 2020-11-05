package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
@Setter

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

    public  void preview(){
        if(openedProject == null)
            return;
        setProjectName(openedProject.getName());
        setTabbedPane(openedProject);

    }
    private  void setTabbedPane(Project project){
        tabbedPane.removeAll();
        for(RuNode ruNodeDocument: project.getChildren()) {
            Document document = (Document) ruNodeDocument;
            tabbedPane.add(project.getName() + " - " + document.getName(), new DocumentPanel(project.getName(),document));// dodati i docPanel
        }
    }
    public void setProjectName(String projectName) {
        projectNameLabel.setText(projectName);
    }



    @Override
    public void update() {
        preview();
    }
}
