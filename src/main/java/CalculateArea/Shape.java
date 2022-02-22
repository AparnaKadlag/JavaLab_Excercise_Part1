package CalculateArea;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {

        //User input for radius
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius = ");
        double radius1=sc.nextDouble();
        Circle c= new Circle(radius1);
        c.showResult();

        //User input of parameter for Rectangle
        System.out.println("Enter length of Rectangle = ");
        int length =sc.nextInt();

        System.out.println("Enter length of Rectangle = ");
        int width =sc.nextInt();
        Rectangle r = new Rectangle(length, width);
        r.showResult();

        //User Input for Square
        System.out.println("Enter side of sqaure = ");
        double side =sc.nextDouble();
        Square s = new Square(side);
        s.showResult();
    }

}
