import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int number, tempNumber, digitsNumber = 0, digitsValue, armstrong = 0, exponent;

        // Getting the number
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        // Calculate the number of digits
        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitsNumber++;
        }

        // Calculate the number is an Armstrong number
        tempNumber = number;
        while (tempNumber > 0) {
            digitsValue = tempNumber % 10;

            exponent = 1;
            for (int i = 1; i <= digitsNumber; i++) {
                exponent *= digitsValue;
            }
            armstrong += exponent;

            tempNumber = tempNumber / 10;
        }

        if (number == armstrong)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        // HOMEWORK : Sum of digits
        int result = 0;
        tempNumber = number;
        while (tempNumber > 0) {
            result += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.println("Sum of digits : " + result);
    }
}
