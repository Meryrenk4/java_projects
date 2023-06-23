import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int number;

        // Getting the number
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        // Printing the triangle
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // HOMEWORK : Diamond with Stars
        System.out.println("Diamond with Stars");

        // upper
        for (int i = 1; i <= number / 2; i++) {
            for (int j = (number / 2) - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower
        for (int i = number / 2; i >= 1; i--) {
            for (int j = i; j <= (number / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
