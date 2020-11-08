package dsw.rudok.app.gui.swing.tree.controller;


import dsw.rudok.app.gui.swing.view.MainFrame;
import dsw.rudok.app.repository.Project;
import dsw.rudok.app.repository.node.RuNode;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class RuTreeMouseListener extends  MouseAdapter{

  @Override
    public void mouseClicked(MouseEvent e){

      if(e.getClickCount() == 2){
        RuNode selectedRuNode = MainFrame.getInstance().getTree().getSelectedRuNode();
        if(selectedRuNode == null || !(selectedRuNode instanceof Project)){
          return;
        }
        Project selectedProject =(Project)selectedRuNode;
        MainFrame.getInstance().getDesktop().setOpenedProject(selectedProject);
        MainFrame.getInstance().getDesktop().preview();
      }


  }


}
