import canvas.*;
import domain.Point;
import domain.Shape;
import primitives.*;
import sprites.House;
import transformations.MirrorOverX;
import transformations.MoveBy;

public class Main {
    public static void main(String[] args) {

//        Canvas canvas = new TextCanvas(60, 30);
        Canvas canvas = new SwingCanvas(80, 70, 10);


        House house1 = new House(new Point(1, 1));
        Shape house2 = new House(new Point(0, 0)) //House
                .transform(new MirrorOverX(26)) // GenericShape
                .transform(new MoveBy(5, 3)); //GenericShape - 2
        Shape landscape = house1.combineWith(house2)
                .transform(new MirrorOverX(20));

        canvas.draw(landscape);

        canvas.show();
    }
}
