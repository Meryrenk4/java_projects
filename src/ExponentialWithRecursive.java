/*
    This project calculates the exponential value based on the exponent and
    base information received from the user by a recursive method.
 */

import java.util.Scanner;

public class ExponentialWithRecursive {
    static int exponential(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * exponential(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int base, exp, result;

        // Getting the variables
        System.out.print("Enter the base : ");
        base = sc.nextInt();
        System.out.print("Enter the exponent : ");
        exp = sc.nextInt();

        // Usage of the method
        result = exponential(base, exp);
        System.out.println(base + " of the " + exp + "th power : " + result);
    }
}
