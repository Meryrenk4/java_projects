import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int year;

        // Getting the variable
        System.out.print("Year of the Birth : ");
        year = sc.nextInt();

        // Finding the zodiac sign
        if (year % 12 == 0) {
            System.out.println("Your Chinese Zodiac Sign is Monkey.");
        } else if (year % 12 == 1) {
            System.out.println("Your Chinese Zodiac Sign is Rooster.");
        }  else if (year % 12 == 2) {
            System.out.println("Your Chinese Zodiac Sign is Dog.");
        }  else if (year % 12 == 3) {
            System.out.println("Your Chinese Zodiac Sign is Pig.");
        }  else if (year % 12 == 4) {
            System.out.println("Your Chinese Zodiac Sign is Rat.");
        }  else if (year % 12 == 5) {
            System.out.println("Your Chinese Zodiac Sign is Ox.");
        }  else if (year % 12 == 6) {
            System.out.println("Your Chinese Zodiac Sign is Tiger.");
        }  else if (year % 12 == 7) {
            System.out.println("Your Chinese Zodiac Sign is Rabbit.");
        }  else if (year % 12 == 8) {
            System.out.println("Your Chinese Zodiac Sign is Dragon.");
        }  else if (year % 12 == 9) {
            System.out.println("Your Chinese Zodiac Sign is Snake.");
        }  else if (year % 12 == 10) {
            System.out.println("Your Chinese Zodiac Sign is Horse.");
        }  else if (year % 12 == 11) {
            System.out.println("Your Chinese Zodiac Sign is Goat.");
        }

    }
}
