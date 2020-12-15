package dsw.rudok.app.repository;

import dsw.rudok.app.repository.node.RuNode;

public abstract class Slot  extends RuNode {
   //pozicija
    private double x;
    private double y;

    //lokacija
    private double width;
    private double height;

   public Slot(String name, RuNode parent, double x, double y , double width, double height){

       super(name,parent);
       this.x = x;
       this.y = y;
       this.width = width;
       this.height = height;

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
