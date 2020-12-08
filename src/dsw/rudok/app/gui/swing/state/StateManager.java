package dsw.rudok.app.gui.swing.state;

import dsw.rudok.app.repository.Diagram;

public class StateManager {

    private State currentState;

    CircleSate circleSate;
    LinkState linkState;
    RectangleState rectangleState;
    SelectState selectState;

    public StateManager(Diagram med) {

        circleSate = new CircleSate(med);
        linkState = new LinkState(med);
        rectangleState = new RectangleState(med);
        selectState = new SelectState(med);
        currentState = selectState;
    }

    public void setCircleSate() {
        currentState = circleSate;
    }

    public void setLinkState() {
        currentState = linkState;
    }

    public void setRectangleState() {
        currentState = rectangleState;
    }

    public void setSelectState() {
        currentState = selectState;
    }

    public State getCurrentState() {
        return currentState;
    }
}
