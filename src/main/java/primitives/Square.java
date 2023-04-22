package primitives;

import domain.Point;

public class Square extends Rectangle {
    public Square(Point vertex, int sideLength) {
        super(vertex, new Point(vertex.getX() + sideLength, vertex.getY() + sideLength));
    }
}
