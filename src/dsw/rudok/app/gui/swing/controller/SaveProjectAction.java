package dsw.rudok.app.gui.swing.controller;

import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Workspace;
import dsw.rudok.app.repository.node.RuNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class SaveProjectAction extends AbstractRudokAction{
    public SaveProjectAction() {

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F2, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, loadIcon("images/saveP.png"));
        putValue(NAME, "Save project");
        putValue(SHORT_DESCRIPTION, "Save project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Workspace workspace = MainFrame.getInstance().getDocumentRepository().getWorkspace();
        RuNode o = MainFrame.getInstance().getTree().getSelectedRuNode();

        //JFileChooser jfc = new JFileChooser();
       // jfc.showOpenDialog(MainFrame.getInstance());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(MainFrame.getInstance());
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath());
        }

    /*    if (o instanceof Project){

            Project  p = (Project) o;
            if(p.getProjectFile() != null){
                File projectFile = p.getProjectFile();

                if(!p.isChanged()){
                    return;
                }

                ObjectOutputStream os;
*/
          /*      try{

                    os = new ObjectOutputStream(new FileOutputStream(projectFile));
                    os.writeObject(p);
                    p.setProjectFile(projectFile);
                    p.setChanged(false);
                    os.close();

                }catch (FileNotFoundException ex){
                    ex.printStackTrace();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }*/
       // }else{
           // AppCore.getInstance().getError().onError(ErrorType.NOTHING_SELECTED);
           JOptionPane.showMessageDialog(null, "Please select project!", "Selection required", JOptionPane.WARNING_MESSAGE);
      //  }


    }
}
