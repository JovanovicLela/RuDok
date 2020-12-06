package dsw.rudok.app.gui.swing.errorHandler;

import dsw.rudok.app.gui.swing.errorHandler.ErrorObserver;
import dsw.rudok.app.gui.swing.errorHandler.ErrorType;


public interface ErrorHandler {

    void addObserver(ErrorObserver errorObserver);
    void onError(ErrorType error);


}
