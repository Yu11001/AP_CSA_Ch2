package Ch2;

import java.util.Scanner;

/*
 * (Geometry: area of a hexagon) 
 * Write a program that prompts the user to enter the side of a hexagon and displays its area. 
 * The formula for computing the area of a hexagon is
 * area = 3 * 1.732 * side * side / 2; or
 */
public class ch2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        input.close();

        // or area = 3 * Math.pow(3,0.5) * Math.pow(side,2) / 2;
        double area = 3 * 1.732 * side * side / 2;

        System.out.println("The area of the hexagon is " + area);
    }
}
