package CalculateArea;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle circle;
    @Test
    public void getArea() {
        circle=new Circle(1.5);
        assertEquals(7.0685834705770345,circle.getArea(),0);
    }

    @Test
    public void getPerimeter() {
        circle=new Circle(1.5);
        assertEquals(9.42477796076938,circle.getPerimeter(),0);
    }
}