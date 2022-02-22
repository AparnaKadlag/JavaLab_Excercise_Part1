package CalculateArea;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangle;

    @Test
    public void getArea() {
        rectangle=new Rectangle(2,3);
        assertEquals(10.0,rectangle.getArea(),0);
    }

    @Test
    public void getPerimeter() {
        rectangle=new Rectangle(2,3);
        assertEquals(6.0,rectangle.getPerimeter(),0);
    }
}