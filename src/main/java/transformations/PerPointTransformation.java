package transformations;

import domain.GenericShape;
import domain.Point;
import domain.Shape;
import domain.Transformation;

import java.util.ArrayList;
import java.util.List;

public abstract class PerPointTransformation implements Transformation {

    protected abstract Point transformPoint(Point originalPoint);

    public Shape transform(Shape origin) {
        List<Point> result = new ArrayList<>();
        for (Point point : origin.getPoints()) {
            Point newPoint = transformPoint(point);
            result.add(newPoint);
        }
        return new GenericShape(result);
    }

}
