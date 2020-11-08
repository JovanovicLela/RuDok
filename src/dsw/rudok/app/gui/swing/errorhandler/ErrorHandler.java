package dsw.rudok.app.gui.swing.errorhandler;

public interface ErrorHandler {

    void addObserver(ErrorObserver errorObserver);
    void onError(int error);
}
