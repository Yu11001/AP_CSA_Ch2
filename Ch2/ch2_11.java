package Ch2;

import java.util.Scanner;

/*
 * (Population projection) 
 * Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years 
 * and displays the population after the number of years. 
 * Use the hint in Programming Exercise 1.11 for this program. 
 * The population should be cast into an integer.
 */
public class ch2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of years : ");
        int years = input.nextInt();
        input.close();

        int currentPopulation = 312032486;

        // 1 year = 365 days >*24hr = 8760 hr >*60min =525,600min > *60sec =31,536,000
        // second
        int yearInSecond = 365 * 24 * 60 * 60;
        double birthPerYear = yearInSecond / 7.0;
        double deathPerYear = yearInSecond / 13.0;
        double immigrantPerYear = yearInSecond / 45.0;

        double populations = currentPopulation + (birthPerYear - deathPerYear + immigrantPerYear) * years;

        System.out.println("The population in " + years + " years is " + (int) populations);
    }
}
