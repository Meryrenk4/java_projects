/*
    This project finds whether the string from the user is a palindrome string.
 */

import java.util.Scanner;

public class PalindromeStrings {

    static boolean palindromeString(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the variable
        String str;

        // Get the variable
        System.out.print("Enter the string : ");
        str = sc.nextLine();

        // Usage the method
        if (palindromeString(str))
            System.out.println(str + " is a palindrome number.");
        else
            System.out.println(str + " is not a palindrome number.");
    }
}
