package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Document;

import javax.swing.*;
import java.awt.*;

public class DocumentPanel extends JPanel {

    private  String projectName = null;
    private Document document = null;

    public DocumentPanel(String projectName, Document document) {
        this.projectName = projectName;
        this.document = document;

        if(document == null || (document.getChildren().size() == 0)){
            return;
        }

        setLayout(new GridLayout(document.getChildren().size(), 1));

        for(int i = 0; i < document.getChildren().size(); i++){
            JPanel panelPage = new JPanel();
            panelPage.setBorder(BorderFactory.createEtchedBorder());
            JLabel lblPage = new JLabel(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());
            panelPage.add(lblPage);
            add(panelPage);
        }

    }
}
