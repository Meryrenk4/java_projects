import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int exp, number, result = 1;

        // Getting the variables
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        System.out.print("Enter the exponent : ");
        exp = sc.nextInt();

        // Calculate the result
        for (int i = 1; i <= exp; i++) {
            result *= number;
        }
        System.out.println("The result is " + result);
    }
}
