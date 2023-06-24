/*
    This project prints a pattern that conforms to the following rule,
    based on the value received from the user by a recursive method.

    N : 16
    Output : 16 11 6 1 -4 1 6 11 16 --> Subtract 5 until the number is less than or equal to 0,
                                        then add 5 until the number reaches its own value.
 */

import java.util.Scanner;

public class PatternWithRecursive {
    static void subtractOrAdd5(int sign, int num, int temp) {
        // if sign is equal to 1, we decrease the number
        // if sign is equal to 2, we increase the number

        if (temp > 0 && sign == 1) {
            System.out.print(" " + temp);
            subtractOrAdd5(1, num, temp - 5);
        } else if (num == temp) {
            System.out.print(" " + temp);
        } else if (temp > 0 && sign == 2) {
            System.out.print(" " + temp);
            subtractOrAdd5(2, num, temp + 5);
        } else if (temp <= 0) {
            System.out.print(" " + temp);
            subtractOrAdd5(2, num, temp + 5);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define and get the number
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Usage the method
        System.out.print("The pattern :");
        subtractOrAdd5(1, number, number);
    }
}
