package shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    void testCircleArea() {
        Circle circle = new Circle(5);
        double expected = Math.PI * 25;
        assertEquals(expected, circle.area(), 0.001);
    }

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24.0, rectangle.area());
    }

    @Test
    void testSquareArea() {
        Square square = new Square(10);
        assertEquals(100.0, square.area());
    }
}
