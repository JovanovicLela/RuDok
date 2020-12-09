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
       // setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for(int i = 0; i < document.getChildren().size(); i++){



            DiagramView diagramView = new DiagramView();
            diagramView.setBorder(BorderFactory.createEtchedBorder());
            diagramView.setVisible(true);
            diagramView.setAutoscrolls(true);
            diagramView.setBackground(Color.getHSBColor(0.5f,0.2f,1f));
            diagramView.setResizable(true);
            diagramView.setPreferredSize(new Dimension(150, 355));



           /* JPanel panelPage = new JPanel();
            panelPage.setBorder(BorderFactory.createEtchedBorder());
            panelPage.setVisible(true);
            panelPage.setAutoscrolls(true);
            panelPage.setPreferredSize(new Dimension(150, 355));
*/
            JLabel lblPage = new JLabel(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());
            diagramView.add(lblPage);

            //diagramView.setTitle(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());

            add(diagramView);

        }

    }
}
