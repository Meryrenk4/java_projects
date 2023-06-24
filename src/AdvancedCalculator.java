/*
    This project works like a calculator that performs operations selected by the user.
 */

import java.util.Scanner;

public class AdvancedCalculator {
    // Addition Operation
    static void addition() {
        Scanner scan = new Scanner(System.in);

        // Defining the variable
        int number, result = 0, counter;

        // Getting the counter
        System.out.print("\nHow many numbers you want to enter : ");
        counter = scan.nextInt();

        // The operation
        for (int i = 1; i <= counter; i++) {
            // Getting the numbers
            System.out.print("Number " + i + " : ");
            number = scan.nextInt();

            result += number;
        }
        System.out.println("Addition of " + counter + " numbers : " + result + "\n");
    }

    // Subtraction Operation
    static void subtraction() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int counter, number, result = 0;

        // Getting the counter
        System.out.print("\nHow many numbers you want to enter : ");
        counter = scan.nextInt();

        // The operation
        for (int i = 1; i <= counter; i++) {
            // Getting the numbers
            System.out.print("Number " + i + " : ");
            number = scan.nextInt();

            // Assigning the number to subtract to the result
            if (i == 1) {
                result += number;
                continue;
            }

            result -= number;
        }
        System.out.println("Subtraction of " + counter + " numbers : " + result + "\n");
    }

    // Multiplication Operation
    static void multiplication() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int number, result = 1, counter;

        // Getting the counter
        System.out.print("\nHow many numbers you want to enter : ");
        counter = scan.nextInt();

        // The operation
        for (int i = 1; i <= counter; i++) {
            // Getting the numbers
            System.out.print("Number " + i + " : ");
            number = scan.nextInt();

            result *= number;
        }
        System.out.println("Multiplication of " + counter + " numbers : " + result + "\n");
    }

    // Division Operation
    static void division() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        double result = 0.0;
        int counter, number;

        // Getting the counter
        System.out.print("\nHow many numbers you want to enter : ");
        counter = scan.nextInt();

        // The operation
        for (int i = 1; i <= counter; i++) {
            // Getting the numbers
            System.out.print("Number " + i + " : ");
            number = scan.nextInt();

            if (i != 1 && number == 0) {
                System.out.println("It is not divisible by 0.");
                continue;
            }

            // Assigning the first number entered as a divisor
            if (i == 1) {
                result = number;
                continue;
            }

            result /= number;
        }
        System.out.println("Division of " + counter + " numbers : " + result + "\n");
    }

    // Exponential Operation
    static void exponential() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int base, exponent, result = 1;

        // Getting the variables
        System.out.print("Enter the base :");
        base = scan.nextInt();
        System.out.print("Enter the exponent :");
        exponent = scan.nextInt();

        // The operation
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " to the " + exponent + "th power : " + result + "\n");
    }

    // Factorial Operation
    static void factorial() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int number, result = 1;

        // Getting the number
        System.out.print("Enter the number :");
        number = scan.nextInt();

        // The operation
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + number + " : " + result + "\n");
    }

    // Module Operator
    static void mod() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int number, module, result;

        // Getting the variables
        System.out.print("Enter the number : ");
        number = scan.nextInt();
        System.out.print("Enter the module value : ");
        module = scan.nextInt();

        // The operation
        result = number % module;
        System.out.println(number + " modules " + module + " : " + result + "\n");
    }

    // Perimeter and Area of Rectangle Operation
    static void perimeterAndArea() {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int side1, side2, area, perimeter;

        // Getting the sides
        System.out.print("Enter the side 1 : ");
        side1 = scan.nextInt();
        System.out.print("Enter the side 2 : ");
        side2 = scan.nextInt();

        // The operation
        area = side1 * side2;
        perimeter = 2 * (side1 + side2);

        System.out.println("Area of the rectangle : " + area);
        System.out.println("Perimeter of the rectangle : " + perimeter + "\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Defining the variables
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponential\n"
                + "6- Factorial\n"
                + "7- Module\n"
                + "8- Perimeter and Area of Rectangle\n"
                + "0- Log Out";

        // Getting the selection
        do {
            System.out.println(menu);
            System.out.print("Select an calculation operation :");
            select = scan.nextInt();

            // Switch-Case for operations
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponential();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    perimeterAndArea();
                    break;
                case 0:
                    System.out.println("You are logged out. We hope you come again.");
                    break;
                default:
                    System.out.println("You did not select a valid operation! Try again.");
                    break;
            }
        } while (select != 0);
    }
}