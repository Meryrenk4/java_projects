/*
    This project finds the greatest number smaller than the entered number and
    the smallest number greater than the entered number from the elements in the array.
 */

import java.util.Scanner;

public class TheClosestValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a list object and define the variables
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int closestMin = Integer.MIN_VALUE, closestMax = Integer.MAX_VALUE, number;
        
        // Get the number
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        
        // Find the closest min and max values
        for (int val : list) {
            // The greatest number smaller than the number.
            if (closestMin < val && val < number) {
                closestMin = val;
            }

            // The smallest number greater than the number.
            if (closestMax > val && val > number) {
                closestMax = val;
            }
        }
        System.out.println("Closest Max : " + closestMax);
        System.out.println("Closest Min : " + closestMin);

    }
}
