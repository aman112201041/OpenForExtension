package shape;

/**
 * Represents a rectangle shape with edge length.
 */
public class Square implements Shape {
    /** edge length of the rectangle. */
    private final double edgeLength;

    public Square(final double edge) {
        this.edgeLength = edge;
    }

    @Override
    public double area() {
        return edgeLength * edgeLength;
    }
}
