package app;

import shape.Circle;
import shape.Rectangle;
import shape.Square;
import shape.Shape;

import java.util.List;

/**
 * Entry point for the application.
 */
public class Main {

    /** Radius of the circle. */
    private static final double CIRCLE_RADIUS = 5;
    /** length of rectangle width. */
    private static final double RECT_WIDTH = 4;
    /** length of rectangle height. */
    private static final double RECT_HEIGHT = 6;
    /** length of square side. */
    private static final double SQUARE_SIDE = 10;

    /**
     * app.Main method that calculates total area of some shapes.
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        final List<Shape> shapes = List.of(
                new Circle(CIRCLE_RADIUS),
                new Rectangle(RECT_WIDTH, RECT_HEIGHT),
                new Square(SQUARE_SIDE)
        );

        final double totalArea = shapes.get(0).area() + shapes.get(1).area() + shapes.get(2).area();

        System.out.println("Total Area: " + totalArea);
    }
}
