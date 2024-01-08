package Ch2;

import java.util.Scanner;

/*
 * (Geometry: area of a triangle) 
 * Write a program that prompts the user to enter three points 
 * (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. 
 * The formula for computing the area of a triangle is
 * s = (side1 + side2 + side3)/2;
 * area = (s(s - side1)(s - side2)(s - side3)) ^0.5
 * 
 * Math.sqrt() = square root
 */
public class ch2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first points x1 : ");
        double x1 = input.nextDouble();
        System.out.print("Please enter the first points y1 : ");
        double y1 = input.nextDouble();

        System.out.print("Please enter the first points x2 : ");
        double x2 = input.nextDouble();
        System.out.print("Please enter the first points y2 : ");
        double y2 = input.nextDouble();

        System.out.print("Please enter the first points x3 : ");
        double x3 = input.nextDouble();
        System.out.print("Please enter the first points y3 : ");
        double y3 = input.nextDouble();

        input.close();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // calculate the semi-perimeter
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math
                .sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        System.out.println("The area of the triangle is " + area);
    }
}
