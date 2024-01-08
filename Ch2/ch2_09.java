package Ch2;

import java.util.Scanner;

/*
 * (Physics: acceleration) 
 * Average acceleration is defined as the change of velocity 
 * divided by the time taken to make the change, as shown in the following formula:
 * a = (v1-v0)/t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, 
 * the ending velocity v1 in meters/second, and the time span t in seconds, 
 * and displays the average acceleration.
 */
public class ch2_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the starting velocity v0 in meters/second : ");
        double startV0 = input.nextDouble();

        System.out.print("Please enter the ending velocity v1 in meters/second : ");
        double endV1 = input.nextDouble();

        System.out.print("Please enter the time span t in seconds : ");
        double time = input.nextDouble();

        input.close();

        double acceleration = (endV1 - startV0) / time;

        System.out.println("The average acceleration is " + acceleration);
    }
}