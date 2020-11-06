package dsw.rudok.app.gui.swing.controller;

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

    public ExitAction getExitAction() {
        return exitAction;
    }

    public void setExitAction(ExitAction exitAction) {
        this.exitAction = exitAction;
    }

    public AboutAction getAboutAction() {
        return aboutAction;
    }

    public void setAboutAction(AboutAction aboutAction) {
        this.aboutAction = aboutAction;
    }

    public NewProjectAction getNewProjectAction() {
        return newProjectAction;
    }

    public void setNewProjectAction(NewProjectAction newProjectAction) {
        this.newProjectAction = newProjectAction;
    }

    public NewDocumentAction getNewDocumentAction() {
        return newDocumentAction;
    }

    public void setNewDocumentAction(NewDocumentAction newDocumentAction) {
        this.newDocumentAction = newDocumentAction;
    }

    public NewPageAction getNewPageAction() {
        return newPageAction;
    }

    public void setNewPageAction(NewPageAction newPageAction) {
        this.newPageAction = newPageAction;
    }

    public NewSlotAction getNewSlotAction() {
        return newSlotAction;
    }

    public void setNewSlotAction(NewSlotAction newSlotAction) {
        this.newSlotAction = newSlotAction;
    }
}
