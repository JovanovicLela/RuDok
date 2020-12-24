package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.io.*;

public class SaveAsAction extends AbstractRudokAction {

    public static String PROJECTAS_EX = ".rdproj";

    public SaveAsAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("control shift S"));
        putValue(SMALL_ICON, loadIcon("images/saveAs.png"));
        putValue(NAME, "Save as");
        putValue(SHORT_DESCRIPTION, "Save project as");

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = MainFrame.getInstance().getTree().getSelectedRuNode();
        Project project = (obj instanceof Project) ? (Project)obj : null;


        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Save As");
        jfc.setFileFilter(new ProjectAsF());
        jfc.setAcceptAllFileFilterUsed(false);

        if(project != null){
            File file;

            if(jfc.showSaveDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION){
                file = jfc.getSelectedFile();
                String s = file.getPath();

                if(!s.endsWith(PROJECTAS_EX)){
                    s += PROJECTAS_EX;
                    file.delete();
                    file = new File(s);
                }else {  return; }

                ObjectOutputStream os;
                try {
                    os = new ObjectOutputStream(new FileOutputStream(file));
                    os.writeObject(project);
                    project.setProjectFile(file);
                    os.close();
                } catch (FileNotFoundException e1){
                    e1.printStackTrace();
                } catch (IOException e2){
                    e2.printStackTrace();
                }
            }
        }
    }


    public class ProjectAsF extends FileFilter {
        @Override
        public boolean accept(File f) {
            return (f.isDirectory());
        }

        @Override
        public String getDescription() {
            return "Rukovalac dokumentima (" + PROJECTAS_EX + ")";
        }
    }


}
