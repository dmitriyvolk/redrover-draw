package domain;

import java.util.List;

public class CombinedShape extends CompositeShape {

    private final List<Shape> shapes;

    public CombinedShape(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    protected List<Shape> getShapes() {
        return shapes;
    }
}
