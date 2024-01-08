package Ch2;

import java.util.Scanner;

/*
 * (Financial application: calculate interest) 
 * If you know the balance and the annual percentage interest rate, 
 * you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and 
 * displays the interest for the next month.
 */
public class ch2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter balance and interest rate (e.g., 3 for 3%) : ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        input.close();

        double monthlyInterestRate = annualInterestRate / 1200;

        double interest = balance * monthlyInterestRate;

        System.out.println("The interest is " + (int) (100 * interest) / 100.0);
    }
}
