package dsw.rudok.app.repository.node;

import dsw.rudok.app.gui.swing.observer.Observer;

public abstract class RuNode implements Observer {

    private String name;
    private RuNode parent;

    public RuNode(String name, RuNode parent) {
        this.name = name;
        this.parent = parent;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof  RuNode){
            RuNode otherObj = (RuNode) obj;
            return  this.getName().equals(otherObj.getName());
        }
        return  false;
    }

    @Override
    public void update() {
        notifyAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyAll();
    }

    public RuNode getParent() {
        return parent;
    }

    public void setParent(RuNode parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "RuNode [name = "+ name + "]";
    }
}


