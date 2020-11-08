package dsw.rudok.app.core;

import dsw.rudok.app.gui.swing.errorHandler.ErrorHandler;

public abstract class ApplicationFramework {

    protected Gui gui;
    protected Repository repository;
    protected ErrorHandler error;

    public abstract void run();

    public void initialise(Gui gui, Repository repository){
        this.error = error;
        this.gui = gui;
        this.repository = repository;
    }
}
