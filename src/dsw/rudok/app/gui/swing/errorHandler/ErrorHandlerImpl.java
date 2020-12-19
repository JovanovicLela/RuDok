package dsw.rudok.app.gui.swing.errorHandler;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandlerImpl implements  ErrorHandler{

    public static final int ERROR_CODE_INVALID_NAME = 1;

    private List<ErrorObserver> observers = new ArrayList<>();

    public ErrorHandlerImpl(){
    }
    @Override
    public void onError(ErrorType code){
        switch (code){
            case EMPTY_NODE_ERROR: {
                notifyObservers(new MyError(1,"The field cannot be empty, please enter text.", "Empty node"));
            }
            case NOTHING_SELECTED: {
                notifyObservers(new MyError(1,"Nothing is selected, please select item.", "Nothing selected"));
            }
            case NULL_SLOT: {
                notifyObservers(new MyError(1, "Slot type cannot be null.", "Null slot"));
            }
        }
    }

    private void notifyObservers(MyError myError){
        for(ErrorObserver observer : observers){
            observer.showWarning(myError);
        }
    }

    @Override
    public void addObserver(ErrorObserver errorObserver){
       observers.add(errorObserver);
    }


}
