package dsw.rudok.app.repository.slot;

import dsw.rudok.app.repository.node.RuNode;

import java.io.Serializable;

public abstract class Slot  extends RuNode implements Serializable {

    private static final long serialVersionUID = 1;

    private SlotModel model = new SlotModel();

    // pozicija
    private double x;
    private double y;

    // dimenzije
    private double width;
    private double height;

    private boolean isSelected = false;
    private double rotate = 0;

   public Slot(String name, RuNode parent, double x, double y , double width, double height){

       super(name,parent);
       this.x = x;
       this.y = y;
       this.width = width;
       this.height = height;

   }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public double getRotate() {
        return rotate;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public SlotModel getModel() {
        return model;
    }

    public void setModel(SlotModel model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public RuNode getParent() {
        return super.getParent();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void update() {
        notifyAll();
    }
}
