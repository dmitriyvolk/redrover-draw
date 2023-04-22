import canvas.Canvas;
import domain.Point;
import domain.Shape;
import primitives.*;
import transformations.MoveBy;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas(60, 30);


        Square square = new Square(new Point(30, 10), 15);
        Shape transformed = new MoveBy(-30, 0).transform(square);
        canvas.draw(transformed);
        canvas.print();
    }
}
