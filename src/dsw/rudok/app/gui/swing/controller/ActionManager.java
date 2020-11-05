package dsw.rudok.app.gui.swing.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionManager {

    private ExitAction exitAction;
    private AboutAction aboutAction;
    private NewProjectAction newProjectAction;
    private NewDocumentAction newDocumentAction;
    private NewPageAction newPageAction;
    private NewSlotAction newSlotAction;

    public  ActionManager(){
        initialiseActions();
    }

    private void initialiseActions() {
        exitAction = new ExitAction();
        aboutAction = new AboutAction();

        newProjectAction = new NewProjectAction();
        newDocumentAction = new NewDocumentAction();
        newPageAction = new NewPageAction();
        newSlotAction = new NewSlotAction();
    }


}
