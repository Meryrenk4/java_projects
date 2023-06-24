/*
    A prime number is defined as a natural number greater than 1 and is divisible by only 1 and itself.

    This project finds whether the number from the user is prime number or not by a recursive method.
 */

import java.util.Scanner;

public class PrimeNumberWithRecursive {
    static boolean isPrime(int num, int counter) {
        // Base cases
        if (num <= 2)
            return num == 2;
        if (num % counter == 0)
            return false;
        if (counter * counter > num)
            return true;

        // Check for next divisor
        return isPrime(num, counter + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define and get the number
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Usage of the method
        if (isPrime(number, 2))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number");
    }
}
