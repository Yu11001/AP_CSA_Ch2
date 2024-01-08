package Ch2;

import java.util.Scanner;

/*
 * (Financial application: calculate tips) 
 * Write a program that reads the subtotal and the gratuity rate, 
 * then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, 
 * the program displays $1.5 as gratuity and $11.5 as total. 
 */

public class ch2_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number in subtotal : ");
        double subtotal = input.nextDouble();

        System.out.print("Please enter a number in gratuity rate(%) : ");
        double gratuityRate = input.nextDouble();

        double gratuity = (subtotal * gratuityRate) / 100;
        double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        input.close();
    }
}
