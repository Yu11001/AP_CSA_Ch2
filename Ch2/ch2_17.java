package Ch2;

import java.util.Scanner;

/*
 * (Science: wind-chill temperature) 
 * How cold is it outside? The temperature alone is not enough to provide the answer. 
 * Other factors including wind speed, relative humidity, 
 * and sunshine play important roles in determining coldness outside. 
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill 
 * temperature to measure the coldness using temperature and wind speed. The formula is
 * t.wc = 35.74 + 0.6215 ta - 25.75v^0.16 + 0.4275 ta v^0.16
 * 
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the 
 * speed measured in miles per hour. twc is the wind-chill temperature. The formula 
 * cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or above 41ºF.
 * 
 * Write a program that prompts the user to enter a temperature between -58 ºF and 
 * 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature. 
 * Use Math.pow(a, b) to compute v0.16. 
 */
public class ch2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a temperature between -58F and 41F : ");
        double temperature = input.nextDouble();

        System.out.print("Please enter a wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();
        input.close();

        double temperatureWC = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " + temperatureWC);
    }
}
