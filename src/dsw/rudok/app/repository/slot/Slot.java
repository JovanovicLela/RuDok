package dsw.rudok.app.repository.slot;

import dsw.rudok.app.gui.swing.view.ImageEditor;
import dsw.rudok.app.gui.swing.view.TextEditor;
import dsw.rudok.app.repository.elements.ElementType;
import dsw.rudok.app.repository.node.RuNode;

import java.io.Serializable;

public abstract class Slot  extends RuNode implements Serializable {

    private static final long serialVersionUID = 1;

    private ElementType type;
    private String content;
    private TextEditor textEditor;
    private ImageEditor imageEditor;
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
   public  Slot(String name, ElementType type){
       super(name);
       this.type = type;
   }

    public ImageEditor getImageEditor() {
        return imageEditor;
    }

    public void setImageEditor(ImageEditor imageEditor) {
        this.imageEditor = imageEditor;
    }

    public ElementType getType() {
        return type;
    }

    public void setType(ElementType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }

    public void setTextEditor(TextEditor textEditor) {
        this.textEditor = textEditor;
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
