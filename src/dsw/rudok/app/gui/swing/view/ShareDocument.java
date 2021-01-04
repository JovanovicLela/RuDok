package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Project;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShareDocument extends JDialog {

    private JLabel label;
    private JPanel panel;
    private ButtonGroup select;

    public ShareDocument(JFrame parent, ArrayList<Document> documents){

        super(parent, "Documents");
        setSize(300, 300);
        setLocationRelativeTo(parent);

        panel = new JPanel();

        select = new ButtonGroup();
        JButton btnSelect = new JButton("Select");

        DefaultListModel projectsList = new DefaultListModel();
        Project project = (Project) documents.get(0).getParent();

        for(Project projects: MainFrame.getInstance().getDocumentRepository().getWorkspace().getProjects()){
            if(projects.equals(project))
                continue;
            projectsList.addElement(projects);
        }
        JList listProj = new JList(projectsList);
        add(listProj, BorderLayout.CENTER);
        add(btnSelect, BorderLayout.NORTH);
    }
}
