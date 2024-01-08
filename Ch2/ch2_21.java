package Ch2;

import java.util.Scanner;

/*
 * (Financial application: calculate future investment value) 
 * Write a program that reads in investment amount, annual interest rate, 
 * and number of years, and displays the future investment value using the following formula:
 * futureInvestmentValue =investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number 
 * of years 1, the future investment value is 1032.98.
 * Enter investment amount: 1000.56 
 * Enter annual interest rate in percentage: 4.25 
 * Enter number of years: 1 
 * Accumulated value is $1043.92
 */
public class ch2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the investment amount : ");
        double investmentAmount = input.nextDouble();
        System.out.print("Please enter annual interest rate in percentage : ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Please enter number of years : ");
        double years = input.nextDouble();
        input.close();

        double futureInvestmentValue = investmentAmount
                * Math.pow((1.0 + annualInterestRate / 100.0 / 12), (years * 12));

        System.out.println("Accumulated value is $" + (double) futureInvestmentValue);
    }
}
