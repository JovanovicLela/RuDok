package dsw.rudok.app.repository.node;

import lombok.Setter;
import lombok.Getter;
@Setter
@Getter

public abstract class RuNode {

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
    public String toString() {
        return "RuNode [name = "+ name + "]";
    }
}
