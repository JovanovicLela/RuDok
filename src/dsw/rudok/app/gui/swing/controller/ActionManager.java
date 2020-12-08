package dsw.rudok.app.gui.swing.controller;

public class ActionManager {

    private ExitAction exitAction;

    private AboutAction aboutAction;

    private NewProjectAction newProjectAction;
    private NewDocumentAction newDocumentAction;
    private NewPageAction newPageAction;
    private NewSlotAction newSlotAction;

    private SaveDiagramAction saveDiagramAction;
    private SaveProjectAction saveProjectAction;
    private SaveWorkspaceAction saveWorkspaceAction;

    private RenameAction renameAction;
    private CLoseTab cLoseTab;
    private CloseAllTabs closeAllTabs;
    private DeleteNodeAction deleteNodeAction;


    private PHandCursorAction PHandCursorAction;
    private PRectangleAction PRectangleAction;
    private PCircleAction PCircleAction;
    private PTriangleAction PTriangleAction;
    private ResizeAction resizeAction;
    private MoveAction moveAction;;
    private RotateAction rotateAction;
    private DeleteElementAction deleteElementAction;





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

        saveDiagramAction = new SaveDiagramAction();
        saveProjectAction = new SaveProjectAction();
        saveWorkspaceAction = new SaveWorkspaceAction();

        renameAction = new RenameAction();
        cLoseTab = new CLoseTab();
        closeAllTabs = new CloseAllTabs();
        deleteNodeAction = new DeleteNodeAction();

        resizeAction = new ResizeAction();
        moveAction = new MoveAction();
        rotateAction = new RotateAction();
        deleteElementAction = new DeleteElementAction();

        //paleta
        PHandCursorAction = new PHandCursorAction();
        PRectangleAction = new PRectangleAction();
        PCircleAction = new PCircleAction();
        PTriangleAction = new PTriangleAction();


    }

    public SaveDiagramAction getSaveDiagramAction() {
        return saveDiagramAction;
    }

    public void setSaveDiagramAction(SaveDiagramAction saveDiagramAction) {
        this.saveDiagramAction = saveDiagramAction;
    }

    public SaveProjectAction getSaveProjectAction() {
        return saveProjectAction;
    }

    public void setSaveProjectAction(SaveProjectAction saveProjectAction) {
        this.saveProjectAction = saveProjectAction;
    }

    public SaveWorkspaceAction getSaveWorkspaceAction() {
        return saveWorkspaceAction;
    }

    public void setSaveWorkspaceAction(SaveWorkspaceAction saveWorkspaceAction) {
        this.saveWorkspaceAction = saveWorkspaceAction;
    }

    public PHandCursorAction getHandCursorAction() {
        return PHandCursorAction;
    }

    public void setHandCursorAction(PHandCursorAction PHandCursorAction) {
        this.PHandCursorAction = PHandCursorAction;
    }

    public PRectangleAction getRectangleAction() {
        return PRectangleAction;
    }

    public void setRectangleAction(PRectangleAction PRectangleAction) {
        this.PRectangleAction = PRectangleAction;
    }

    public PCircleAction getCircleAction() {
        return PCircleAction;
    }

    public void setCircleAction(PCircleAction PCircleAction) {
        this.PCircleAction = PCircleAction;
    }

    public PTriangleAction getTriangleAction() {
        return PTriangleAction;
    }

    public void setTriangleAction(PTriangleAction PTriangleAction) {
        this.PTriangleAction = PTriangleAction;
    }

    public DeleteNodeAction getDeleteNodeAction() {
        return deleteNodeAction;
    }

    public void setDeleteNodeAction(DeleteNodeAction deleteNodeAction) {
        this.deleteNodeAction = deleteNodeAction;
    }

    public RenameAction getRenameAction() {
        return renameAction;
    }

    public void setRenameAction(RenameAction renameAction) {
        this.renameAction = renameAction;
    }

    public CloseAllTabs getCloseAllTabs() {
        return closeAllTabs;
    }

    public void setCloseAllTabs(CloseAllTabs closeAllTabs) {
        this.closeAllTabs = closeAllTabs;
    }

    public CLoseTab getcLoseTab() {
        return cLoseTab;
    }

    public void setcLoseTab(CLoseTab cLoseTab) {
        this.cLoseTab = cLoseTab;
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
