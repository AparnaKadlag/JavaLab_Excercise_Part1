package CalculateArea;

public class Square
{
    public   double area;
    public   double perimeter;
    public double length;

    public Square(double length) {
        this.length = length;
    }
    public double getArea()
    {
        area=4*this.length;
        return area;
    }

    public double getPerimeter()    {
        perimeter=this.length*this.length;
        return perimeter;

    }
    public void showResult()
    {
        System.out.println("Perimeter of Circle is= "+getPerimeter());
        System.out.println("Area of circle is= "+getArea());
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}