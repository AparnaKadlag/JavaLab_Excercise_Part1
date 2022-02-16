package CalculateArea;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateAreaTest {


    private CalculateArea calculateArea=new CalculateArea();
    @org.junit.Before
    public void setup(){
        System.out.println("Running a test");
    }
    @org.junit.Test
    public void rectangePerimeterAndArea() {
        calculateArea.RectangePerimeterAndArea(2,3);
        assertEquals( 6.0,calculateArea.RectangleArea,0);
        assertEquals( 10.0,calculateArea.RectanglePerimeter,0);
        assertEquals(true,calculateArea.isRectangleCalculated());
    }


    @org.junit.Test
    public void sqaurePerimeterAndArea() {
        calculateArea.sqaurePerimeterAndArea(4);
        assertEquals( 16.0,calculateArea.squareArea,0);
        assertEquals( 16.0,calculateArea.squarePerimeter,0);
        assertEquals(true,calculateArea.isSquareCalcualted());
    }

    @org.junit.Test
    public void circlePerimeterAndArea() {
        calculateArea.circlePerimeterAndArea(1.5);
        assertEquals( 7.0685834705770345,calculateArea.circleArea,0);
        assertEquals( 9.42477796076938,calculateArea.circlePerimeter,0);
        assertEquals(true,calculateArea.isCircleCalcualted());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This exectues after any class");
    }
}