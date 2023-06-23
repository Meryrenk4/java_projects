import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int year;

        // Getting the variable
        System.out.print("Enter the year : ");
        year = sc.nextInt();

        // Checking the year is a leap year
        if (year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0)
                System.out.println(year + " is not a leap year.");
            else
                System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
