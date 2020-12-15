package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.repository.Document;

import javax.swing.*;
import java.util.ArrayList;

public class DocumentPanel extends JDesktopPane {

    private  String projectName = null;
    private Document document = null;

    private ArrayList<PageView> pageList = new ArrayList<>();


    public DocumentPanel(String projectName, Document document) {
        this.projectName = projectName;
        this.document = document;

        if(document == null || (document.getChildren().size() == 0)){
         return;
        }
        addPages();
    }

    private  void addPages(){
        for(int i = 0; i<document.getPages().size(); i++){
            PageView pageView = new PageView(document.getPages().get(i), (i+1) );
            pageList.add(pageView);
            add(pageView);
        }
    }



    public String getProjectName() {
        return projectName;
    }

    public Document getDocument() {
        return document;
    }

    public ArrayList<PageView> getPageList() {
        return pageList;
    }



}
