package Ch2;

import java.util.Scanner;

/*
 * (Find the number of years) 
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
 * and displays the number of years and days for the minutes. 
 * For simplicity, assume a year has 365 days.
 */
public class ch2_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number in minutes : ");
        double minutes = input.nextDouble();

        double day = minutes / 60.0 / 24;
        double year = day / 365;
        double remainDay = day % 365;

        System.out.println(
                minutes + " minutes is approximately " + (int) year + " years and " + (int) remainDay + " days.");

        // result might be 1.0E9 minutes... > 1.0E9 means 1.0*10^9
        input.close();
    }
}
