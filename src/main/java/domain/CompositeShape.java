package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeShape implements Shape {

    protected abstract List<Shape> getShapes();

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        for (Shape shape: getShapes()) {
            result.addAll(shape.getPoints());
        }
        return result;
    }
}
