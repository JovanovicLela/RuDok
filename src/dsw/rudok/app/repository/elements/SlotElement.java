package dsw.rudok.app.repository.elements;

import dsw.rudok.app.gui.swing.view.painters.ElementPainter;

import java.awt.*;
import java.io.Serializable;

public abstract class SlotElement implements Serializable {

    private static final long serialVersionUID = 1;

    // ova klasa nam daje opis bilo kog elementa,
    // takodje opisuje i linkove dijagrama i elemente dijagrama

    protected Paint paint;
    protected Stroke stroke;
    protected Color strokeColor;

    protected  String name;
    protected  String description;

    protected ElementPainter elementPainter;

    protected double rotate;

    public SlotElement(Stroke stroke, Paint paint, Color strokeColor) {
        this.paint = paint;
        this.stroke = stroke;
        this.strokeColor = strokeColor;

    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(Color strokeColor) {
        this.strokeColor = strokeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ElementPainter getElementPainter() {
        return elementPainter;
    }

    public void setElementPainter(ElementPainter elementPainter) {
        this.elementPainter = elementPainter;
    }

    public double getRotate() {
        return rotate;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }
}
