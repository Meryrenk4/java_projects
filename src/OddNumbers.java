import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int number, sum = 0;

        // Getting the variable
        do {
            // Getting the variable
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            // Checking the number if it is odd
            if (number % 2 == 1)
                sum += number;

        } while (number >= 0);

        System.out.println("Sum of the odd numbers : " + sum);

        // HOMEWORK : Add multiple of 4 and even from the entered numbers until an odd number is entered.
        sum = 0;

        do {
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            if (number % 4 == 0)
                sum += number;

        } while (number % 2 == 0);

        System.out.println("Sum of even and multiply by 4 : " + sum);
    }
}
