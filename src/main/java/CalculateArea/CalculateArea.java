package CalculateArea;

public class CalculateArea {
    public double RectangleArea;
    public double RectanglePerimeter;

    public double squareArea;
    public double squarePerimeter;

    public double circleArea;
    public double circlePerimeter;

    private boolean RectangleCalculated =false;
    private boolean SquareCalcualted=false;
    private boolean CircleCalcualted=false;


    public void RectangePerimeterAndArea(double length, double width) {
        if(length<=0 && width<=0){
            throw new RuntimeException("Enter Valid Value");
        }
        RectanglePerimeter=2*(length+width);
        RectangleArea=length*width;
        System.out.println("Area Of Rectangle = "+RectangleArea);
        System.out.println("Perimeter Of Rectangle = "+RectanglePerimeter);
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
        squarePerimeter=4*side;
        squareArea=side*side;
        System.out.println("Area Of Square = "+squareArea);
        System.out.println("Perimeter Of Sqaure = "+squarePerimeter);
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
        circlePerimeter=2 * Math.PI * radius;
        circleArea=(radius*radius)*Math.PI;
        System.out.println("Area Of circle = "+circleArea);
        System.out.println("Perimeter Of circle = "+circlePerimeter);
        CircleCalcualted=true;
    }
    public boolean isCircleCalcualted(){
        if(CircleCalcualted){
            return true;
        }return false;
    }
}
