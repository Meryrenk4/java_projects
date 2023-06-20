// This project calculate the hypotenuse of a triangle created by taking
// the lengths of the perpendicular sides from the users.

import java.util.Scanner;

public class CalculateHypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables for the lengths of the perpendicular sides and the hypotenuse
        double pSide1, pSide2, hypotenuse;

        // Getting the lengths from user
        System.out.println("Please enter the length of the perpendicular sides below");
        System.out.print("Perpendicular Side 1 : ");
        pSide1 = input.nextDouble();
        System.out.print("Perpendicular Side 2 : ");
        pSide2 = input.nextDouble();

        // Calculating the hypotenuse
        hypotenuse = Math.sqrt(pSide1 * pSide1 + pSide2 * pSide2);
        System.out.println("The Hypotenuse : " + hypotenuse);

        // Homework : Calculate Area of the Triangle
        // Calculate the area using sides

        // Defining the variables for the perimeter, u and the area
        double perimeter, u, area;

        // Calculating the perimeter and u
        perimeter = pSide1 + pSide2 + hypotenuse;
        u = perimeter / 2.0;

        // Calculating the area
        area = Math.sqrt(u * Math.abs(u - pSide1) * Math.abs(u - pSide2) * Math.abs(u - hypotenuse));
        System.out.println("The Area : " + area);

    }
}
