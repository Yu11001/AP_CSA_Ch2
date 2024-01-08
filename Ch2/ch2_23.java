package Ch2;

import java.util.Scanner;

/*
 * (Cost of driving) 
 * Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, 
 * and displays the cost of the trip.
 */
public class ch2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the driving distance : ");
        double distance = input.nextDouble();
        System.out.print("Please enter miles per gallon : ");
        double miles = input.nextDouble();
        System.out.print("Please price per gallon : ");
        double price = input.nextDouble();
        input.close();

        double cost = distance / miles * price;

        System.err.println("The cost of driving is " + cost);
    }
}
