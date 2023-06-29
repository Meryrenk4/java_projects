/*
    This project aims the user to find a random number between 0 and 100 determined by the system.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the variables
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 0, selected;
        boolean isWin = false, isWrong = false;
        int[] wrong = new int[5];

        // The Number Guessing Game
        while (right < 5) {
            // Get the number
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            // Check the number is between 0 and 100
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the number between 0 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining rights : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The number you guessed : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number!");
                if (selected > number) {
                    System.out.println("The number " + selected + " is greater than the hidden number.");
                } else {
                    System.out.println("The number " + selected + " is smaller than the hidden number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining rights : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
                System.out.println("The hidden number : " + number);
            }
        }
    }
}
