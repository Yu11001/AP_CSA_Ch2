package Ch2;

import java.util.Scanner;

/*
 * (Science: calculating energy) 
 * Write a program that calculates the energy needed to heat water 
 * from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in kilograms and the initial 
 * and final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, 
 * and energy Q is measured in joules.
 */
public class ch2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount of water in kilograms : ");
        double waterKilo = input.nextDouble();

        System.out.print("Please enter the initial temperatures of water : ");
        double initialTemperature = input.nextDouble();

        System.out.print("Please enter the final temperatures of the water : ");
        double finalTemperature = input.nextDouble();

        input.close();

        double energy = waterKilo * (finalTemperature - initialTemperature) * 4184.0;

        System.out.println("The energy needed is " + energy);
    }
}
