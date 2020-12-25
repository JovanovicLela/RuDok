package dsw.rudok.app.gui.swing.view;

import dsw.rudok.app.gui.swing.observer.Observer;
import dsw.rudok.app.repository.Document;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.ArrayList;

public class DocumentPanel extends JDesktopPane implements Observer {

    public static final Dimension SIZE = new Dimension(650, 650);
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

    public DocumentPanel() {

    }

    private  void addPages(){
        for(int i = 0; i<document.getPages().size(); i++){
            PageView pageView = new PageView(document.getPages().get(i), (i+1) );
            pageList.add(pageView);
            add(pageView);
        }
    }

    public void cascade(){
        int size = getAllFrames().length;

        for(int i = 0; i < size; i++){
            getAllFrames()[i].setLocation(30 + i*40, 30 + i*40);
            getAllFrames()[i].setSize(SIZE);

            try {
                getAllFrames()[i].setSelected(true);
            } catch (PropertyVetoException e){
                e.printStackTrace();
            }

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

    @Override
    public void update() {
        notifyAll();
    }
}
