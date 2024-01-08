package Ch2;

import java.util.Scanner;

/*
 * (Convert feet into meters) 
 * Write a program that reads a number in feet, 
 * converts it to meters, and displays the result. 
 * One foot is 0.305 meters.
 */
public class ch2_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number in feet : ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        // simple way: combine line 17 and line 21:
        // System.out.println(feet + " feet in meters :" + feet*0.305);

        System.out.println(feet + " feet in meters :" + meters);

        input.close();
    }
}