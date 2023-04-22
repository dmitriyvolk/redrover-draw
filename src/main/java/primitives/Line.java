package primitives;

import domain.Point;
import domain.Shape;

import java.util.ArrayList;
import java.util.List;

public class Line implements Shape {

    private final Point from;
    private final Point to;

    public Line(Point from, Point to) {
        if (from.getX() < to.getX()) {
            this.from = from;
            this.to = to;
        } else {
            this.from = to;
            this.to = from;
        }
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();

        int rise = this.to.getY() - this.from.getY();
        int run = this.to.getX() - this.from.getX();

        int iterations = Math.max(Math.abs(rise), Math.abs(run));

        float stepX = run * 1.0f / iterations;
        float stepY = rise * 1f / iterations;


        for (int i = 0; i < iterations; i++) {
            Point point = new Point(
                    this.from.getX() + Math.round(i * stepX),
                    this.from.getY() + Math.round(i * stepY)
            );
            result.add(point);
        }
        result.add(to);
        return result;
    }
}
