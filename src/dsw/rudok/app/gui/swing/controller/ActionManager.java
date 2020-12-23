package dsw.rudok.app.gui.swing.controller;

public class ActionManager {

    private ExitAction exitAction;
    private AboutAction aboutAction;
    private HelpAction helpAction;
    private SaveProjectAction saveProjectAction;
    private SaveAsAction saveAsAction;
    private SaveSlotAction saveSlotAction;
    private SaveWorkspaceAction saveWorkspaceAction;
    private OpenProjectAction openProjectAction;

    private NewProjectAction newProjectAction;
    private NewDocumentAction newDocumentAction;
    private NewPageAction newPageAction;

    private RenameAction renameAction;
    private CLoseTab cLoseTab;
    private CloseAllTabs closeAllTabs;
    private DeleteNodeAction deleteNodeAction;

    //paleta
    private PHandCursorAction PHandCursorAction;
    private PRectangleAction PRectangleAction;
    private PCircleAction PCircleAction;
    private PTriangleAction PTriangleAction;
    private PResizeAction PResizeAction;
    private PRotateAction PRotateAction;
    private PMoveAction PMoveAction;;
    private dsw.rudok.app.gui.swing.controller.PDeleteElementAction PDeleteElementAction;

    private CascadeDiagramAction cascadeDiagramAction;
    private TileHorizontallyDiagramAction tileHorizontallyDiagramAction;
    private TileVerticallyDiagramAction tileVerticallyDiagramAction;
    private CloseDiagramAction closeDiagramAction;
    private CloseAllDiagramAction closeAllDiagramAction;


    public  ActionManager(){
        initialiseActions();
    }

    private void initialiseActions() {
        exitAction = new ExitAction();
        aboutAction = new AboutAction();
        helpAction = new HelpAction();
        saveProjectAction = new SaveProjectAction();
        saveAsAction = new SaveAsAction();
        saveSlotAction = new SaveSlotAction();
        saveWorkspaceAction = new SaveWorkspaceAction();
        openProjectAction = new OpenProjectAction();

        newProjectAction = new NewProjectAction();
        newDocumentAction = new NewDocumentAction();
        newPageAction = new NewPageAction();

        renameAction = new RenameAction();
        cLoseTab = new CLoseTab();
        closeAllTabs = new CloseAllTabs();
        deleteNodeAction = new DeleteNodeAction();

        //paleta
        PHandCursorAction = new PHandCursorAction();
        PRectangleAction = new PRectangleAction();
        PCircleAction = new PCircleAction();
        PTriangleAction = new PTriangleAction();
        PResizeAction = new PResizeAction();
        PRotateAction = new PRotateAction();
        PMoveAction = new PMoveAction();
        PDeleteElementAction = new PDeleteElementAction();

        cascadeDiagramAction = new CascadeDiagramAction();
        tileHorizontallyDiagramAction = new TileHorizontallyDiagramAction();
        tileVerticallyDiagramAction = new TileVerticallyDiagramAction();
        closeDiagramAction = new CloseDiagramAction();
        closeAllDiagramAction = new CloseAllDiagramAction();
    }

    public OpenProjectAction getOpenProjectAction() {
        return openProjectAction;
    }

    public HelpAction getHelpAction() {
        return helpAction;
    }

    public SaveAsAction getSaveAsAction() {
        return saveAsAction;
    }

    public SaveSlotAction getSaveSlotAction() {
        return saveSlotAction;
    }

    public PResizeAction getResizeAction(){
        return PResizeAction;
    }


    public CloseDiagramAction getCloseDiagramAction() {
        return closeDiagramAction;
    }

    public CloseAllDiagramAction getCloseAllDiagramAction() {
        return closeAllDiagramAction;
    }

    public CascadeDiagramAction getCascadeDiagramAction() {
        return cascadeDiagramAction;
    }

    public TileHorizontallyDiagramAction getTileHorizontallyDiagramAction() {
        return tileHorizontallyDiagramAction;
    }

    public TileVerticallyDiagramAction getTileVerticallyDiagramAction() {
        return tileVerticallyDiagramAction;
    }


    public PRotateAction getRotateAction() {
        return PRotateAction;
    }
    public PMoveAction getMoveAction(){
        return PMoveAction;
    }
    public PDeleteElementAction getDeleteElementAction(){
        return  PDeleteElementAction;
    }

    public SaveSlotAction getSaveDiagramAction() {
        return saveSlotAction;
    }

    public void setSaveDiagramAction(SaveSlotAction saveSlotAction) {
        this.saveSlotAction = saveSlotAction;
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

}
