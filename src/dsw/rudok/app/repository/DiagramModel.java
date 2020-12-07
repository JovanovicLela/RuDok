package dsw.rudok.app.repository;

import dsw.rudok.app.repository.elements.DiagramDevice;

import javax.swing.event.EventListenerList;
import java.util.ArrayList;

public class DiagramModel {

    private static int count = 0;
    private String name;

    protected ArrayList<DiagramDevice> diagramElements = new ArrayList<>();
    EventListenerList listenerList = new EventListenerList();



}
