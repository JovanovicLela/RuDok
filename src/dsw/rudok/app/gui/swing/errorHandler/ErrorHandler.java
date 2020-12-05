package dsw.rudok.app.gui.swing.errorHandler;

public interface ErrorHandler {

    void addObserver(ErrorObserver errorObserver);
    void onError(ErrorType error);
}
