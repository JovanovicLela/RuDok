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

            JPanel panelPage = new JPanel();
            panelPage.setBorder(BorderFactory.createEtchedBorder());
            panelPage.setVisible(true);
            panelPage.setAutoscrolls(true);
            panelPage.setPreferredSize(new Dimension(150, 355));

            //panelPage.setMinimumSize(new Dimension(300, 300));


            //panelPage.setAlignmentX(Component.CENTER_ALIGNMENT);
            //panelPage.setPreferredSize(new Dimension(100, 500));
            //panelPage.setMaximumSize(new Dimension(100, 500));
           // panelPage.setSize(new Dimension(150, 100));
            /*JScrollPane scroll1 = new JScrollPane(panelPage);
            scroll1.setMinimumSize(new Dimension(200, 150));
            scroll1.setVerticalScrollBarPolicy(22);
            scroll1.setVisible(true);
            add(scroll1,  BorderLayout.CENTER);
*/
            JLabel lblPage = new JLabel(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());
            panelPage.add(lblPage);
            add(panelPage);

        }

    }
}
