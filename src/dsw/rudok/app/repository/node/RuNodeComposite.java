package dsw.rudok.app.repository.node;

import java.util.ArrayList;
import java.util.List;

public abstract class RuNodeComposite extends  RuNode {

    List<RuNode> children;


    public RuNodeComposite(String name, RuNode parent) {
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public  abstract  void addChild(RuNode child);
    public  abstract  void removeChild(RuNode child);

    public RuNodeComposite(String name, RuNode parent, List<RuNode> children) {
        super(name, parent);
        this.children = children;
    }

    public List<RuNode> getChildren() {
        return children;
    }

    public void setChildren(List<RuNode> children) {
        this.children = children;
    }
}
