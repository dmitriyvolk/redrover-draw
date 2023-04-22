package transformations;

import domain.GenericShape;
import domain.Point;
import domain.Shape;
import domain.Transformation;

import java.util.ArrayList;
import java.util.List;

public class MoveBy implements Transformation {

    private final int x;
    private final int y;

    public MoveBy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Shape transform(Shape origin) {
        List<Point> result = new ArrayList<>();
        for (Point point: origin.getPoints()) {
            Point newPoint = new Point(point.getX() + x, point.getY() + y);
            result.add(newPoint);
        }
        return new GenericShape(result);
    }
}
