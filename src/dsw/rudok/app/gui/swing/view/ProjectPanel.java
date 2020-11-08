package dsw.rudok.app.gui.swing.view;

import com.sun.tools.javac.Main;
import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;


import javax.swing.*;
import java.awt.*;
import java.awt.ScrollPane;

public class ProjectPanel extends JPanel implements Observer {


    private  JLabel projectNameLabel = new JLabel();
    private JTabbedPane tabbedPane = new JTabbedPane();
    private Project openedProject = null;
   // JScrollPane scroll1 = new JScrollPane();


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
        //scroll1.setMinimumSize(new Dimension(200, 150));
       // scroll1.setVerticalScrollBarPolicy(22);
        //scroll1.setVisible(true);
       // add(scroll1);
        setProjectName(openedProject.getName());
        setTabbedPane(openedProject);

    }

    private  void setTabbedPane(Project project){
        tabbedPane.removeAll();

        for(RuNode ruNodeDoc: project.getChildren()){
            Document document = (Document) ruNodeDoc;
            tabbedPane.add(project.getName() + " - " + document.getName(), new DocumentPanel(project.getName(), document));

        }

    }


    public void setProjectName(String projectName) {
        projectNameLabel.setText(projectName);
    }

    public void setOpenedProject(Project openedProject) {
        this.openedProject = openedProject;
    }
    @Override
    public void update() {
        preview();
    }
}
