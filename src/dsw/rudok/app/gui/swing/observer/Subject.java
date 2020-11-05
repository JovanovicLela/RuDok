package dsw.rudok.app.gui.swing.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public Subject(){

    }
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
