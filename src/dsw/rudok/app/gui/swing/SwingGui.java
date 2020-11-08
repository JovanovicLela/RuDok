package dsw.rudok.app.gui.swing;

import dsw.rudok.app.core.Gui;
import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.errorhandler.ErrorHandler;
import dsw.rudok.app.gui.swing.view.MainFrame;


public class SwingGui implements Gui {

    private MainFrame instance;
    private Repository documentRepository;
    private ErrorHandler error;

    public SwingGui(Repository documentRepository,ErrorHandler error) {
        this.error = error;
        this.documentRepository = documentRepository;
    }

    @Override
    public void start() {
        instance = MainFrame.getInstance();
        instance.setDocumentRepository(documentRepository);
        instance.setError(error);
        instance.initialiseWorkspaceTree();
        instance.setVisible(true);

    }
}
