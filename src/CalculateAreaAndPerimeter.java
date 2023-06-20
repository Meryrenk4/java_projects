// This project calculates the area and perimeter of the circle.

import java.util.Scanner;

public class CalculateAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables for perimeter, area and radius
        double radius, perimeter, area;

        // Getting the radius from user
        System.out.print("Please enter the radius : ");
        radius = input.nextDouble();

        // Calculating the area and perimeter
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("The area of the circle : " + area);
        System.out.println("The perimeter of the circle : " + perimeter);


        // Homework : Calculate the area of the circle segment with
        // the measure of the central angle

        // Defining the central angle and circle segment area
        double centralAngle, segmentArea;

        // Getting the central angle from user
        System.out.print("Please enter the central angle : ");
        centralAngle = input.nextDouble();

        // Calculating the circle segment area
        segmentArea = (Math.PI * radius * radius) * centralAngle / 360;
        System.out.println("The circle segment area : " + segmentArea);

    }
}
