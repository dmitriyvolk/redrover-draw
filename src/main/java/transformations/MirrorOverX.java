package transformations;

import domain.Point;

public class MirrorOverX extends PerPointTransformation {

    private final int x;

    public MirrorOverX(int x) {
        this.x = x;
    }

    @Override
    protected Point transformPoint(Point originalPoint) {
        int distance = x - originalPoint.getX();
        return new Point(x + distance, originalPoint.getY());
    }
}
