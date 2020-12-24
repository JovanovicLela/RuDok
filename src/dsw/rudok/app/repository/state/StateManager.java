package dsw.rudok.app.repository.state;

public class StateManager {

    private State currentState;

    private CircleSate circleSate;
    private RectangleState rectangleState;
    private TriangleState triangleState;
    private SelectState selectState;
    private ResizeState resizeState;

    public StateManager() {

        circleSate = new CircleSate();
        rectangleState = new RectangleState();
        triangleState = new TriangleState();
        selectState = new SelectState();
        resizeState = new ResizeState();
        currentState = selectState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCircleSate() {
        currentState = circleSate;
    }

    public void setRectangleState() {
        currentState = rectangleState;
    }

    public void setTriangleState() {
        currentState = triangleState;
    }

    public void setSelectState() {
        currentState = selectState;
    }

    public void setResizeState(ResizeState resizeState) {
        currentState = resizeState;
    }
}

