package canvas;

import domain.Point;
import domain.Shape;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class TextCanvas implements Canvas {
    private final Pixel[][] pixels;
    private final int height;
    private final int width;

    private String SET = " 0 ";
    private String UNSET = " · ";

    public TextCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new Pixel[height][width];
        clean();
    }

    public void clean() {
        for (Pixel[] row : pixels) {
            Arrays.fill(row, new Pixel(false));
        }
    }

    public void draw(Shape shape) {
        for (Point point : shape.getPoints()) {
            set(point.getX(), point.getY());
        }
    }

    private void set(int x, int y) {
        if (x >= 0 && y >= 0 && x < width && y < height) {
            pixels[y][x] = new Pixel(true);
        }
    }

    @Override
    public void show() {
        for (int y = height - 1; y >= 0; y--) {
            if (y % 5 == 0) {
                System.out.print(String.format("%1$3s", y));
            } else {
                System.out.print("   ");
            }
            for (int x = 0; x < width; x++) {
                if (pixels[y][x].isSet()) {
                    System.out.print(SET);
                } else {
                    System.out.print(UNSET);
                }
            }
            System.out.println();
        }
        System.out.print("    ");
        for (int x = 0; x < width; x++) {
            if (x % 5 == 0) {
                System.out.print(StringUtils.rightPad(String.valueOf(x), 3));
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }

}
