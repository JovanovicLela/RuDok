package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.*;

public class SaveProjectAction extends AbstractRudokAction{

    public static String PROJECT_EX = ".rdproj";

    public SaveProjectAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveP.png"));
        putValue(NAME, "Save project");
        putValue(SHORT_DESCRIPTION, "Save project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {



        RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();
        Project project = (Project) selectedRuNode;
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new ProjectF());
        jfc.setAcceptAllFileFilterUsed(false);

        if(project != null){

            File file;

            if(jfc.showOpenDialog(MainFrame.getInstance()) == JFileChooser.APPROVE_OPTION){
                file = jfc.getSelectedFile();
                String s = file.getPath();

                if(!s.endsWith(PROJECT_EX)){
                    s += PROJECT_EX;
                    file.delete();
                    file = new File(s);
                }
            }else{ return; }

            ObjectOutputStream os;
            try {
                os = new ObjectOutputStream(new FileOutputStream(file));
                os.writeObject(project);
                project.setProjectFile(file);
                os.close();
            } catch (FileNotFoundException a){
                a.printStackTrace();
            } catch (IOException b){
                b.printStackTrace();
            }
        }
    }

    public class ProjectF extends FileFilter{
        @Override
        public boolean accept(File f) {
            return (f.isDirectory());
        }

        @Override
        public String getDescription() {
            return "Rukovalac dokumentima (" + PROJECT_EX + ")";
        }
    }
}
