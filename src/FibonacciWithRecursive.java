/*
    The Fibonacci sequence is a sequence in which each number is the sum of the two preceding numbers.
    -> 1, 1, 2, 3, 5, 8, 13, 21, 34...

    This project finds fibonacci series with a recursive method.
 */

import java.util.Scanner;

public class FibonacciWithRecursive {
    // Recursive Method
    static int fibonacci (int num) {
        // Checking the number is one or two
        if (num == 1 || num == 2)
            return 1;

        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining and getting the number
        int number;

        System.out.print("Please enter a number : ");
        number = sc.nextInt();

        // Usage the fibonacci method
        System.out.print("Fibonacci Series of " + number + " numbers: ");
        for(int i = 1; i <= number; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
