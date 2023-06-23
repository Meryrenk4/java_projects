import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        String month;
        int dayOfMonth;

        // Getting the variables
        System.out.print("Month of Birth : ");
        month = sc.nextLine();
        System.out.print("Day of the Month : ");
        dayOfMonth = sc.nextInt();

        // Finding the zodiac sign with If-Else
        if (month.equals("January")) {
            if (dayOfMonth <= 21) {
                System.out.println("You are Capricorn.");
            } else {
                System.out.println("You are Aquarius.");
            }
        } else if (month.equals("February")) {
            if (dayOfMonth <= 19) {
                System.out.println("You are Aquarius.");
            } else {
                System.out.println("You are Pisces.");
            }
        } else if (month.equals("March")) {
            if (dayOfMonth <= 20) {
                System.out.println("You are Pisces.");
            } else {
                System.out.println("You are Aries.");
            }
        } else if (month.equals("April")) {
            if (dayOfMonth <= 20) {
                System.out.println("You are Aries.");
            } else {
                System.out.println("You are Taurus.");
            }
        } else if (month.equals("May")) {
            if (dayOfMonth <= 21) {
                System.out.println("You are Taurus.");
            } else {
                System.out.println("You are Gemini.");
            }
        } else if (month.equals("June")) {
            if (dayOfMonth <= 22) {
                System.out.println("You are Gemini.");
            } else {
                System.out.println("You are Cancer.");
            }
        } else if (month.equals("July")) {
            if (dayOfMonth <= 22) {
                System.out.println("You are Cancer.");
            } else {
                System.out.println("You are Leo.");
            }
        } else if (month.equals("August")) {
            if (dayOfMonth <= 22) {
                System.out.println("You are Leo.");
            } else {
                System.out.println("You are Virgo.");
            }
        } else if (month.equals("September")) {
            if (dayOfMonth <= 22) {
                System.out.println("You are Virgo.");
            } else {
                System.out.println("You are Libra.");
            }
        } else if (month.equals("October")) {
            if (dayOfMonth <= 22) {
                System.out.println("You are Libra.");
            } else {
                System.out.println("You are Scorpio.");
            }
        } else if (month.equals("November")) {
            if (dayOfMonth <= 21) {
                System.out.println("You are Scorpio.");
            } else {
                System.out.println("You are Sagittarius.");
            }
        } else if (month.equals("December")) {
            if (dayOfMonth <= 21) {
                System.out.println("You are Sagittarius.");
            } else {
                System.out.println("You are Capricorn.");
            }
        } else {
            System.out.println("You entered wrong.");
        }

    }
}