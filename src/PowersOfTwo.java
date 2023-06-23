import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int number;

        // Getting the variable
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        // Printing the powers of two
        System.out.print("Powers of 2 : ");
        for (int i = 0; i <= number; i++) {
            if (Math.pow(2, i) <= number)
                System.out.printf("%,.0f %s",Math.pow(2, i), "");
        }

        // HOMEWORK : Powers of 4 and 5 up to the entered number
        System.out.print("\nPowers of 4 : ");
        for (int j = 0; j <= number; j++) {
            if (Math.pow(4, j) <= number)
                System.out.printf("%,.0f %s",Math.pow(4, j), "");
        }

        System.out.print("\nPowers of 5 : ");
        for (int k = 0; k <= number; k++) {
            if (Math.pow(5, k) <= number)
                System.out.printf("%,.0f %s",Math.pow(5, k), "");
        }
    }
}
