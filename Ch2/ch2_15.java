package Ch2;

import java.util.Scanner;

/*
 * (Geometry: distance of two points)
 * write a program that prompts the user to enter two points (x1,y1) and (x2,y2) and displays
 * their distance. the formula for computing the distance is 
 * square root(x2-x1)^2+(y2-y1)^2
 * note that you can use Math.pow(a,0.5) to compute square root a.
 */
public class ch2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first points x1 : ");
        double x1 = input.nextDouble();
        System.out.print("Please enter the first points y1 : ");
        double y1 = input.nextDouble();

        System.out.print("Please enter the first points x2 : ");
        double x2 = input.nextDouble();
        System.out.print("Please enter the first points y2 : ");
        double y2 = input.nextDouble();

        input.close();

        double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);

        System.out.println("The distance between the two points is " + (double) distance);
    }
}
