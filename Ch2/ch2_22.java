package Ch2;

/*
 * (Financial application: monetary units) 
 * Rewrite Listing 2.10, ComputeChange.java, 
 * to fix the possible loss of accuracy when converting a double value to an int value. 
 * Enter the input as an integer whose last two digits represent the cents. 
 * For example, the input 1156 represents 11 dollars and 56 cents.
 */
public class ch2_22 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Receive the amount entered from the keyboard
        System.out.print("Enter an amount in integer, for example 1156 \nfor 11 dollars and 56 cents: ");
        int amount = input.nextInt();
        input.close();

        int remainingAmount = amount;

        // Find the number of one dollars
        int numOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quaters in the remaining amount
        int numOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of ");
        System.out.println(numOfOneDollars + " dollars");
        System.out.println(numOfQuarters + " quarters");
        System.out.println(numOfDimes + " dimes");
        System.out.println(numOfNickels + " nickels");
        System.out.println(numOfPennies + " pennies");
    }
}

/*
 * public class ComputeChange {
 * public static void main(String[] args) {
 * // Create a Scanner
 * Scanner input = new Scanner(System.in);
 * 
 * // Receive the amount
 * System.out.print(
 * "Enter an amount in double, for example 11.56: ");
 * double amount = input.nextDouble();
 * 
 * int remainingAmount = (int)(amount * 100);
 * 
 * // Find the number of one dollars
 * int numberOfOneDollars = remainingAmount / 100;
 * remainingAmount = remainingAmount % 100;
 * 
 * // Find the number of quarters in the remaining amount
 * int numberOfQuarters = remainingAmount / 25;
 * remainingAmount = remainingAmount % 25;
 * 
 * // Find the number of dimes in the remaining amount
 * int numberOfDimes = remainingAmount / 10;
 * remainingAmount = remainingAmount % 10;
 * 
 * // Find the number of nickels in the remaining amount
 * int numberOfNickels = remainingAmount / 5;
 * remainingAmount = remainingAmount % 5;
 * 
 * // Find the number of pennies in the remaining amount
 * int numberOfPennies = remainingAmount;
 * 
 * // Display results
 * System.out.println("Your amount " + amount + " consists of");
 * System.out.println("    " + numberOfOneDollars + " dollars");
 * System.out.println("    " + numberOfQuarters + " quarters ");
 * System.out.println("    " + numberOfDimes + " dimes");
 * System.out.println("    " + numberOfNickels + " nickels");
 * System.out.println("    " + numberOfPennies + " pennies");
 * }
 * }
 */