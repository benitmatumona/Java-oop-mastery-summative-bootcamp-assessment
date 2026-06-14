package oopmastery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question05_RectangleTest {

    @Test
    void shouldCalculateArea() {

        Question05_Rectangle rectangle =
                new Question05_Rectangle(
                        4,
                        5
                );

        assertEquals(
                20,
                rectangle.area()
        );
    }

    @Test
    void shouldCalculatePerimeter() {

        Question05_Rectangle rectangle =
                new Question05_Rectangle(
                        4,
                        5
                );

        assertEquals(
                18,
                rectangle.perimeter()
        );
    }

    @Test
    void squareShouldCalculateCorrectly() {

        Question05_Rectangle rectangle =
                new Question05_Rectangle(
                        10,
                        10
                );

        assertEquals(
                100,
                rectangle.area()
        );

        assertEquals(
                40,
                rectangle.perimeter()
        );
    }

    @Test
    void zeroDimensionsShouldReturnZeroArea() {

        Question05_Rectangle rectangle =
                new Question05_Rectangle(
                        0,
                        10
                );

        assertEquals(
                0,
                rectangle.area()
        );
    }
}