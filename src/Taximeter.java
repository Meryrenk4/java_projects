// This program calculates the taximeter amount according to the distance traveled (km)
// and prints it on the screen.

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables for taximeter, minimum wage, opening price of the taxi,
        // the distance traveled and the total fee
        double taximeter = 2.2, minWage = 20.0, openingPrice = 10.0;
        double distance, totalFee;

        // Getting the distance traveled from user
        System.out.print("Enter the distance : ");
        distance = input.nextDouble();

        // Calculating the total fee
        totalFee = openingPrice + (taximeter * distance);
        System.out.println("Total fee : " + totalFee);

        // Checking how the total price will be reflected on the taximeter
        if(totalFee <= minWage) {
            System.out.println("The total fee is lower that the minimum wage, so the fee that you will pay is " + minWage + " TL.");
        }
        else {
            System.out.println("The fee that you will pay is " + totalFee + " TL.");
        }
    }
}
