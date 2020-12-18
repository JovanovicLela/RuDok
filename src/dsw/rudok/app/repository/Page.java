package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;
import dsw.rudok.app.repository.slot.Slot;

import java.util.ArrayList;

public class Page extends RuNodeComposite {

    private ArrayList<Diagram> diagrams = new ArrayList<Diagram>();

    public Page(String name, RuNode parent){
        super(name,parent);
    }
    @Override
    public void addChild(RuNode child){
        if(child != null && child instanceof Slot){
            Slot slot =(Slot) child;
            if(!this.getChildren().contains(slot)){
                this.getChildren().add(slot);
            }
        }
    }

    @Override
    public void removeChild(RuNode child) {
        if(child != null && child instanceof Slot){
            Slot slot =(Slot) child;
            if(this.getChildren().contains(slot)){
                this.getChildren().remove(slot);
            }
        }

    }
    public void addDiagram(Diagram diagram){
        diagrams.add(diagram);
        diagram.setName( this.getName()+" - Diagram  - Graphical editor:"+String.valueOf(diagrams.size()));

    }

    @Override
    public void update() {
        notifyAll();
    }
}
