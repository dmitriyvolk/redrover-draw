package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Shape {
    List<Point> getPoints();

    default Shape transform(Transformation transformation) {
        return transformation.transform(this);
    }

    default Shape combineWith(Shape other) {
        return new CombinedShape(Arrays.asList(this, other));
    }
}
