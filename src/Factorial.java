import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int number;
        double factorial = 1;

        // Getting the variable
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " : " + factorial);
    }
}
