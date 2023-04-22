package primitives;

import domain.Point;
import domain.Shape;

import java.util.ArrayList;
import java.util.List;

public class Dot implements Shape {

    private final Point coordinates;

    public Dot(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        result.add(coordinates);
        return result;
    }
}
