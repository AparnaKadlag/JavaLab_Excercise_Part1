package CalculateArea;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square square;
    @Test
    public void getArea() {
        square = new Square(4);
        assertEquals(16.0,square.getArea(),0);
    }

    @Test
    public void getPerimeter() {
        square = new Square(4);
        assertEquals(16.0,square.getPerimeter(),0);
    }
}