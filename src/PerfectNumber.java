import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int number, result = 0;

        // Getting the number
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        // Calculate if the number is a perfect number
        for (int i = 1; i <= number/ 2; i++) {
            if (number % i == 0)
                result += i;
        }

        if (result == number)
            System.out.println(number + " is a perfect number.");
        else
            System.out.println(number + " is not an perfect number.");
    }
}
