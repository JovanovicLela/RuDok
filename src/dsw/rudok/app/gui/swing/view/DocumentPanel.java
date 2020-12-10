package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Document;
import dsw.rudok.app.repository.Page;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DocumentPanel extends JDesktopPane {

    private  String projectName = null;
    private Document document = null;

    private ArrayList<DiagramView> pageList = new ArrayList<>();


    public DocumentPanel(String projectName, Document document) {
        this.projectName = projectName;
        this.document = document;
        addPages();
        //putPages();

        if(document == null || (document.getChildren().size() == 0)){
         return;
        }

       setLayout(new GridLayout(document.getChildren().size(), 1));
       // setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for(int i = 0; i < document.getChildren().size(); i++){


            // ako je samo DiagramView, prikazuje se, ali ne kao internalFrame po kome je moguce raditi
            /*DiagramView diagramView = new DiagramView();
            diagramView.setBorder(BorderFactory.createEtchedBorder());
            diagramView.setVisible(true);
            diagramView.setAutoscrolls(true);
            diagramView.setBackground(Color.getHSBColor(0.5f,0.2f,1f));
            diagramView.setResizable(true);
            diagramView.setPreferredSize(new Dimension(150, 355));*/

/*
            JPanel panelPage = new JPanel();
            panelPage.setBorder(BorderFactory.createEtchedBorder());
            panelPage.setVisible(true);
            panelPage.setAutoscrolls(true);
            panelPage.setPreferredSize(new Dimension(150, 355));


            JLabel lblPage = new JLabel(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());
            panelPage.add(lblPage);*/

           // panelPage.add(diagramView);
            //diagramView.setTitle(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());

           // add(panelPage);

            JPanel panelPage = new JPanel();
            panelPage.setBorder(BorderFactory.createEtchedBorder());
            panelPage.setVisible(true);
            panelPage.setAutoscrolls(true);
            panelPage.setPreferredSize(new Dimension(150, 355));


            JLabel lblPage = new JLabel(projectName + " - " + document.getName() + " - " + document.getChildren().get(i).getName());
            panelPage.add(lblPage);

            add(panelPage);


        }


    }

    private  void addPages(){
        for(Page page: document.getPages())
            pageList.add(new DiagramView(page));
    }

    private void putPages(){
        for(DiagramView diagramView: pageList){
            this.add(diagramView);
        }
    }



    public String getProjectName() {
        return projectName;
    }

    public Document getDocument() {
        return document;
    }

    public ArrayList<DiagramView> getPageList() {
        return pageList;
    }



}
