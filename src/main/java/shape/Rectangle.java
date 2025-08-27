package shape;

/**
 * Represents a rectangle shape with width and height.
 */
public class Rectangle implements Shape {
    /** width of the rectangle. */
    private final double width;
    /** height of the rectangle. */
    private final double height;

    public Rectangle(final double rectangleWidth, final double rectangleHeight) {
        this.width = rectangleWidth;
        this.height = rectangleHeight;
    }

    @Override
    public double area() {
        return width * height;
    }
}
