package primitives;

import domain.Point;
import domain.Shape;

import java.util.ArrayList;
import java.util.List;

public class Quadrilateral implements Shape {

    private final Point vertex1;
    private final Point vertex2;
    private final Point vertex3;
    private final Point vertex4;

    public Quadrilateral(Point vertex1, Point vertex2, Point vertex3, Point vertex4) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        this.vertex4 = vertex4;
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        result.addAll(new Line(vertex1, vertex2).getPoints());
        result.addAll(new Line(vertex2, vertex3).getPoints());
        result.addAll(new Line(vertex3, vertex4).getPoints());
        result.addAll(new Line(vertex4, vertex1).getPoints());
        return result;
    }
}
