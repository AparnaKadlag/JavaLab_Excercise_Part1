package CalculateArea;

public class CalculateArea {
    private double RectangleArea;
    private boolean RectangleCalculated =false;
    private boolean SquareCalcualted=false;
    private boolean CircleCalcualted=false;

    public void RectangePerimeterAndArea(double length, double width) {
        if(length<=0 && width<=0){
            throw new RuntimeException("Enter Valid Value");
        }
        double  perimeter=2*(length+width);
        RectangleArea=length*width;
        System.out.println("Area Of Rectangle = "+RectangleArea);
        System.out.println("Perimeter Of Rectangle = "+perimeter);
        RectangleCalculated=true;
    }
    public boolean isRectangleCalculated(){
        if(RectangleCalculated){
            return true;
        }return false;
    }
    public void sqaurePerimeterAndArea(double side) {
        if(side<=0){
            throw new RuntimeException("Enter Valid Value");
        }
        double  perimeter=4*side;
        double  Area=side*side;
        System.out.println("Area Of Square = "+Area);
        System.out.println("Perimeter Of Sqaure = "+perimeter);
        SquareCalcualted=true;
    }
    public boolean isSquareCalcualted(){
        if(SquareCalcualted){
            return true;
        }return false;
    }

    public void circlePerimeterAndArea(double radius) {
        if(radius<=0){
            throw new RuntimeException("Enter Valid Value");
        }
        double  perimeter=2 * Math.PI * radius;
        double  Area=(radius*radius)*Math.PI;
        System.out.println("Area Of circle = "+Area);
        System.out.println("Perimeter Of circle = "+perimeter);
        CircleCalcualted=true;
    }
    public boolean isCircleCalcualted(){
        if(CircleCalcualted){
            return true;
        }return false;
    }
}
