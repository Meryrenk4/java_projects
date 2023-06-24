import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int first = 0, second = 1, third, number;

        // Getting the number
        System.out.print("Enter a  number : ");
        number = sc.nextInt();

        // Calculate the fibonacci
        System.out.print("Fibonacci : " + first + " " + second);
        for (int i = 2; i < number; i++) {
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }
}
