package transformations;

import domain.Point;

public class MoveBy extends PerPointTransformation {

    private final int x;
    private final int y;

    public MoveBy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Point transformPoint(Point originalPoint) {
        Point newPoint = new Point(originalPoint.getX() + x, originalPoint.getY() + y);
        return newPoint;
    }
}
