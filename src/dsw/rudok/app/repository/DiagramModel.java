package dsw.rudok.app.repository;

import dsw.rudok.app.gui.swing.event.UpdateEvent;
import dsw.rudok.app.gui.swing.event.UpdateListener;
import dsw.rudok.app.repository.elements.DiagramDevice;

import javax.swing.event.EventListenerList;
import java.util.ArrayList;
import java.util.Iterator;

public class DiagramModel {

    private static int count = 0;
    private String name;

    protected ArrayList<DiagramDevice> diagramElements = new ArrayList<DiagramDevice>();
    EventListenerList listenerList = new EventListenerList();
    UpdateEvent updateEvent = null;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
         DiagramModel.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;

    }

    public int getElementCount(){
        return  diagramElements.size();
    }
    public Iterator<DiagramDevice> getDeviceIterator(){
        return diagramElements.iterator();
    }
    public  void addDiagramElements(DiagramDevice device){

        diagramElements.add(device);
        fireUpdatePerformed();
    }
    public  void addUpdateListener(UpdateListener l){
        listenerList.add(UpdateListener.class, l);
    }
    public  void removeUpdateListener(UpdateListener l){
        listenerList.remove(UpdateListener.class, l);
    }

    protected  void fireUpdatePerformed(){
        Object[] listeners = listenerList.getListenerList();

        for(int i = listeners.length-1; i>=0; i-=1){
            if(listeners[i] == UpdateListener.class){
                if(updateEvent == null)
                    updateEvent = new UpdateEvent(this);
                ((UpdateListener)listeners[i+1]).updatePerformed(updateEvent);
            }
        }
     }




}
