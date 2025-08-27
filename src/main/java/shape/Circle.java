package shape;

/**
 * Represents a circle shape with radius.
 */
public class Circle implements Shape {

    /** Radius of the circle. */
    private final double radius;

    public Circle(final double circleRadius) {
        this.radius = circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
