package CalculateArea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculateArea calculateArea =new CalculateArea();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius = ");
        double radius1=sc.nextDouble();
        calculateArea.circlePerimeterAndArea(radius1);

        System.out.println("Enter length of Rectangle = ");
        double length =sc.nextDouble();
        System.out.println("Enter length of Rectangle = ");
        double width =sc.nextDouble();
        calculateArea.RectangePerimeterAndArea(length,width);

        System.out.println("Enter side of sqaure = ");
        double side =sc.nextDouble();
        calculateArea.sqaurePerimeterAndArea(side);
    }

}
