package Ch2;

import java.util.Scanner;

/*
 * (Convert pounds into kilograms) 
 * Write a program that converts pounds into kilograms. 
 * The program prompts the user to enter a number in pounds, 
 * converts it to kilograms, and displays the result. 
 * One pound is 0.454 kilograms. 
 */

public class ch2_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number in pounds : ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds in kilograms :" + kilograms);

        input.close();
    }
}
