package dsw.rudok.app.repository.slot;

import dsw.rudok.app.gui.swing.event.UpdateEvent;
import dsw.rudok.app.gui.swing.event.UpdateListener;
import dsw.rudok.app.repository.elements.SlotDevice;
import dsw.rudok.app.repository.elements.SlotElement;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class SlotModel {

    private static int count = 0;
    private String name;

    protected ArrayList<SlotElement> diagramElements = new ArrayList<SlotElement>();
    EventListenerList listenerList = new EventListenerList();
    UpdateEvent updateEvent = null;




    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
         SlotModel.count = count;
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
// metoda koja pronalazi indeks elem koji se nalazi na  zadatim koordinatama
    public int getDeviceAtPosition(Point point){
        for(int i = getDeviceCount()-1; i >= 0; i--) {
            SlotElement device = getDeviceAt(i);
            if (device.getElementPainter().isElementAt(point)) {
                return i;
            }
        }
        return -1;
    }
    public  int getDeviceCount(){
        return  diagramElements.size();
    }
    public SlotElement getDeviceAt(int i){
        return  diagramElements.get(i);
    }

    public int getElementCount(){
        return  diagramElements.size();
    }

    public Iterator<SlotElement> getDeviceIterator(){
        return diagramElements.iterator();
    }
    public  void addDiagramElements(SlotDevice device){

        diagramElements.add(device);
        fireUpdatePerformed();
    }
    public  void addUpdateListener(UpdateListener l){
        listenerList.add(UpdateListener.class, l);
    }
    public  void removeUpdateListener(UpdateListener l){
        listenerList.remove(UpdateListener.class, l);
    }

    protected  void fireUpdatePerformed(){ //svim listenerima se javlja da se dogadjaj dogodio
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
