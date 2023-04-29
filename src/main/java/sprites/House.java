package sprites;

import domain.CompositeShape;
import domain.GenericShape;
import domain.Point;
import domain.Shape;
import primitives.Line;
import primitives.Rectangle;
import primitives.Square;
import transformations.MoveBy;

import java.util.ArrayList;
import java.util.List;

public class House extends CompositeShape {

    private final Point lowerLeft;

    public House(Point lowerLeft) {
        this.lowerLeft = lowerLeft;
    }

    @Override
    protected List<Shape> getShapes() {
        List<Shape> allShapes = new ArrayList<>();
        allShapes.add(new Rectangle(new Point(0, 0), new Point(26, 20))); //wall
        allShapes.add(new Rectangle(new Point(17, 0), new Point(22, 12))); //door
        allShapes.add(new Square(new Point(5, 10), 5)); //window
        allShapes.add(new Line(new Point(0, 20), new Point(12, 25)));
        allShapes.add(new Line(new Point(12, 25), new Point(26, 20)));
        return allShapes;
    }

    @Override
    public List<Point> getPoints() {
        List<Point> originalPoints = super.getPoints();
        return new MoveBy(lowerLeft.getX(), lowerLeft.getY()).transform(new GenericShape(originalPoints)).getPoints();
    }



}
