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
        calculateArea.RectangePerimeterAndArea(1,1);
        assertEquals(true,calculateArea.isRectangleCalculated());
    }


    @org.junit.Test
    public void sqaurePerimeterAndArea() {
        calculateArea.sqaurePerimeterAndArea(3);
        assertEquals(true,calculateArea.isSquareCalcualted());
    }

    @org.junit.Test
    public void circlePerimeterAndArea() {
        calculateArea.circlePerimeterAndArea(2.5);
        assertEquals(true,calculateArea.isCircleCalcualted());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This exectues after any class");
    }
}