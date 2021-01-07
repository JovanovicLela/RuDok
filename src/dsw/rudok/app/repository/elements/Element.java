package dsw.rudok.app.repository.elements;

import dsw.rudok.app.repository.node.RuNode;

import java.io.Serializable;

public class Element extends RuNode implements Serializable {

    private static final long serialVersionUID = 1;

    private String name;

    public Element(String name, RuNode parent) {
        super(name, parent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
