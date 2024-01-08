package Ch2;

import java.util.Scanner;

/*
 * (Financial application: compound value) 
 * Suppose you save $100 each month into a savings account with the annual interest rate 5%. 
 * Thus, the monthly interest rate is 0.05/12 = 0.00417. 
 * After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417,
 * After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252,
 * After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and 
 * displays the account value after the sixth month. 
 */
public class ch2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a monthly saving amount : ");
        double savingAmount = input.nextDouble();
        input.close();

        double firstMonth = savingAmount * (1 + 0.00417);
        double secondMonth = (firstMonth + savingAmount) * (1 + 0.00417);
        double thirdMonth = (secondMonth + savingAmount) * (1 + 0.00417);
        double fourthMonth = (thirdMonth + savingAmount) * (1 + 0.00417);
        double fifthMonth = (fourthMonth + savingAmount) * (1 + 0.00417);
        double sixthMonth = (fifthMonth + savingAmount) * (1 + 0.00417);

        System.out.println("After the sixth month, the account value is " + sixthMonth);
    }
}

/*
 * use loop
 * 
 * for(int i=1;i<=6;i++){
 * accountValue = (accountValue + savingAmount) * (1 + 0.00417);
 * }
 * 
 * int month = 1;
 * while (month <= 6) {
 * accountValue = (accountValue + savingAmount) * (1 + 0.00417);
 * month++;
 * }
 * 
 * int month = 1;
 * do {
 * accountValue = (accountValue + SavingAmount) * (1 + 0.00417);
 * month++;
 * } while (month <= 6);
 * 
 */