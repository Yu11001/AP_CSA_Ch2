package Ch2;

import java.util.Scanner;

/*
 * (Sum the digits in an integer) 
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
 * For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

public class ch2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 0 to 1000 : ");
        int number = input.nextInt();

        // Extracts the last digit of the number e.g: 932 % 10 = 2
        int lastDigit = number % 10;

        // Removes the last digit from the number e.g: 932 / 10 = 93
        int remainingNumber = number / 10;

        // Extracts the second last digit of the number e.g: 93 % 10 = 3
        int secondLastDigit = remainingNumber % 10;

        // Removes the second last digit from the remaining number e.g: 93 / 10 = 9
        remainingNumber = remainingNumber / 10;

        // Extracts the third last digit of the number e.g: 9 % 10 = 9
        int thirdLastDigit = remainingNumber % 10;

        int sum = lastDigit + secondLastDigit + thirdLastDigit;

        System.out.println("the sum of  " + number + " is : " + sum);

        input.close();
    }
}

/*
 * public static void main(String[] args) {
 * // Create a Scanner object to read input
 * Scanner scanner = new Scanner(System.in);
 * 
 * // Prompt the user to enter an integer between 0 and 1000
 * System.out.print("Enter an integer between 0 and 1000: ");
 * int inputNumber = scanner.nextInt();
 * 
 * // Close the Scanner to avoid resource leak
 * scanner.close();
 * 
 * // Validate that the input is within the specified range
 * if (inputNumber < 0 || inputNumber > 1000) {
 * System.out.println("Please enter a valid integer between 0 and 1000.");
 * } else {
 * // Calculate the sum of digits
 * int sum = 0;
 * int remainingNumber = inputNumber;
 * 
 * while (remainingNumber > 0) {
 * // Extract the last digit and add it to the sum
 * sum += remainingNumber % 10;
 * 
 * // Remove the last digit
 * remainingNumber /= 10;
 * }
 * 
 * // Display the result
 * System.out.println("The sum of digits is: " + sum);
 * }
 * }
 */