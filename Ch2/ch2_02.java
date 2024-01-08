package Ch2;

import java.util.Scanner;

/*
 * (Compute the volume of a cylinder) 
 * Write a program that reads in the radius and length of a cylinder 
 * and computes the area and volume using the following formulas:
 * area = radius * radius * p
 * volume = area * length
 */
public class ch2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number in radius : ");
        double radius = input.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI; // Math.PI can changed to 3.14 or 3.14159

        System.out.print("Please enter a number in length : ");
        double length = input.nextDouble();
        double volume = area * length;

        System.out.println("The area is " + area + "\nThe volume is " + volume);

        input.close();
    }
}
