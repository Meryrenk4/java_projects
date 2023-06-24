/*
    Palindromic numbers are numbers that are equal to the same number when read from both sides.
    For examples : 1, 4, 8, 99, 101, 363, 4004, 9889....

    This project calculates whether the number entered by the user is a palindrome.
 */

import java.util.Scanner;

public class Palindromic {
    // Calculating whether the number is a palindrome
    static boolean isPalindromeNumber (int number) {
        int tempNumber = number, lastDigit, reversedNumber = 0;

        // Reversing the number
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;

            tempNumber /= 10;
        }

        // Checking the status of number
        return reversedNumber == number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int number;

        // Getting the number
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        // Printing the result
        if (isPalindromeNumber(number))
            System.out.println(number + " is a palindrome number.");
        else
            System.out.println(number + " is not a palindrome number.");

    }
}
