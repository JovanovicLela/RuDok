package dsw.rudok.app.gui.swing.errorhandler;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandlerImpl implements ErrorHandler {

    public static final int ERROR_CODE_INVALID_NAME = 1;

    private List<ErrorObserver> observers = new ArrayList<>();

    public ErrorHandlerImpl(){
    }
    @Override
    public void onError(int code){
        switch (code){
            case ERROR_CODE_INVALID_NAME: {
            notifyObservers("Polje ne sme biti prazno, molim vas unesite tekst. ");
            }
        }
    }

    private void notifyObservers(String message){
        for(ErrorObserver observer : observers){
            observer.showWarning(message);
        }
    }

    @Override
    public void addObserver(ErrorObserver errorObserver){
       observers.add(errorObserver);
    }


}
