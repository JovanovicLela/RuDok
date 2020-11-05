package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;
import dsw.rudok.app.repository.node.RuNodeComposite;

public class Page extends RuNodeComposite {

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
}
