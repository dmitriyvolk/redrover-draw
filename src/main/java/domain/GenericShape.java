package domain;

import java.util.List;

public class GenericShape implements Shape{
    private final List<Point> points;

    public GenericShape(List<Point> points) {
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }
}
