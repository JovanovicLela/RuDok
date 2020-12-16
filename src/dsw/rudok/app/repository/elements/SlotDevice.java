package dsw.rudok.app.repository.elements;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class SlotDevice extends SlotElement {

    protected Dimension size;
    protected Point2D position;

    protected  int inputNo;
    protected  int outputNo;

    protected ArrayList<InputOutputElement> inputs = new ArrayList<InputOutputElement>();
    protected ArrayList<InputOutputElement> outputs = new ArrayList<InputOutputElement>();


    public SlotDevice(Point2D position, Dimension size, Stroke stroke, Paint paint, Color strokeColor, int inputNo, int outputNo) {
        super(stroke, paint, strokeColor);
        this.size = size;

        position.setLocation(position.getX()-size.getWidth()/2, position.getY()-size.getHeight()/2); // translacija tacaka da bi se elem kreirao u centru

        this.position = position;
        this.strokeColor = strokeColor;
        this.inputNo = inputNo;
        this.outputNo = outputNo;

        //ulaz
        for(int i = 0; i < inputNo; i++){

            Point2D ioPos = new Point2D.Double(position.getX(), position.getY() + (getSize().getHeight()/ (getInputNo() + 1) * (i+1)));
            addInput((InputOutputElement) InputOutputElement.createDefault(ioPos, stroke, paint, this, i+1, InputOutputElement.INPUT));

        }

        //izlaz
        for (int i = 0;i < outputNo ;i++){

            Point2D ioPos = new Point2D.Double(position.getX()+size.width, position.getY() + (getSize().getHeight()/ (getOutputNo() + 1)) * (i+1)) ;
            addOutput((InputOutputElement) InputOutputElement.createDefault(ioPos,stroke,paint,this,i+1,InputOutputElement.OUTPUT));

        }

    }
    // metode potrebne za rad sa kolekcijom ulaza
    public  void addInput(InputOutputElement p){
        inputs.add(p);
    }
    public void removeInput(InputOutputElement p){
        inputs.remove(p);
    }
    public InputOutputElement getInputAt(int i){
        return inputs.get(i);
    }
    public  int getInputCount(){
        return  inputs.size();
    }
    public Iterator getInputIterator(){
        return inputs.iterator();
    }
    // *******************************************************


    //  metode za rad kolekcijom izlaza

    public void addOutput(InputOutputElement p){
        outputs.add(p);
    }
    public void removeOutput(InputOutputElement p){
        outputs.remove(p);
    }
    public InputOutputElement getOutputAt(int i){
        return outputs.get(i);
    }
    public int getIOutputCount(){
        return outputs.size();
    }
    public Iterator getOutputIterator(){
        return outputs.iterator();
    }
    // ******************************************************


    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size) {
        this.size = size;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public int getInputNo() {
        return inputNo;
    }

    public void setInputNo(int inputNo) {
        this.inputNo = inputNo;
    }

    public int getOutputNo() {
        return outputNo;
    }

    public void setOutputNo(int outputNo) {
        this.outputNo = outputNo;
    }

    public ArrayList<InputOutputElement> getInputs() {
        return inputs;
    }

    public void setInputs(ArrayList<InputOutputElement> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<InputOutputElement> getOutputs() {
        return outputs;
    }

    public void setOutputs(ArrayList<InputOutputElement> outputs) {
        this.outputs = outputs;
    }
}
