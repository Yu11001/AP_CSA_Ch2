package Ch2;

import java.util.Scanner;

/*
 * (Physics: finding runway length) 
 * Given an airplane’s acceleration a and take-off speed v, 
 * you can compute the minimum runway length needed for an airplane to 
 * take off using the following formula:
 * length = v^2 /2a
 * 
 * Write a program that prompts the user to enter v in meters/second (m/s) and the 
 * acceleration a in meters/second squared (m/s2), 
 * and displays the minimum runway length.
 */
public class ch2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter v in meters/second (m/s) : ");
        double speed = input.nextDouble();

        System.out.print("Please enter acceleration a in meters/second squared (m/s2) : ");
        double acceleration = input.nextDouble();

        input.close();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
