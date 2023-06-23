import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int number;

        // Getting the number
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        // Printing the inverted triangle
        for (int i = number; i >= 1; i--) {
            for (int j = i; j <= number; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
