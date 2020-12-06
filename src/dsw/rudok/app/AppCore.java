package dsw.rudok.app;

import dsw.rudok.app.core.ApplicationFramework;
import dsw.rudok.app.core.Gui;
import dsw.rudok.app.core.Repository;
import dsw.rudok.app.gui.swing.SwingGui;
import dsw.rudok.app.gui.swing.errorHandler.ErrorHandler;
import dsw.rudok.app.gui.swing.errorHandler.ErrorHandlerImpl;
import dsw.rudok.app.repository.RepositoryImpl;

public class AppCore extends ApplicationFramework {

    private static AppCore instance;

    private AppCore() {
    }

    public  static  AppCore getInstance(){
        if(instance == null){
            instance = new AppCore();
        }
        return  instance;
    }

    public void run() {
        this.gui.start();
    }

    public static void main(String[] args) {
        Repository repository = new RepositoryImpl();
        ErrorHandler error = new ErrorHandlerImpl();

        Gui gui = new SwingGui(repository,error);
        ApplicationFramework appCore = AppCore.getInstance();

        appCore.initialise(gui, repository, error);
        appCore.run();
    }
     public ErrorHandler getError(){
        return error;
     }

}
