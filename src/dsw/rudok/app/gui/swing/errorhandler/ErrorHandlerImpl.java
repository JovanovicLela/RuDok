package dsw.rudok.app.gui.swing.errorhandler;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandlerImpl implements ErrorHandler {

    public static final int ERROR_CODE_INVALID_NAME = 1;

    private List<ErrorObserver> observers = new ArrayList<>();

    public ErrorHandlerImpl(){
    }
    @Override
    public void addObserver(ErrorObserver errorObserver){

    }
    @Override
    public void onError(int code){

    }

}
