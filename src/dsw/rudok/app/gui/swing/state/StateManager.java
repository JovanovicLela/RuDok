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

    public void setCircleSate(CircleSate circleSate) {
        currentState = circleSate;
    }

    public void setLinkState(LinkState linkState) {
        currentState = linkState;
    }

    public void setRectangleState(RectangleState rectangleState) {
        currentState = rectangleState;
    }

    public void setSelectState(SelectState selectState) {
        currentState = selectState;
    }

    public State getCurrentState() {
        return currentState;
    }
}
