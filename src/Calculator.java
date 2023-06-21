import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables
        int num1, num2, select;

        // Creating the menu for calculations
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Select an calculation operation : ");
        select = input.nextInt();

        // Getting the numbers
        System.out.print("Number 1 : ");
        num1 = input.nextInt();
        System.out.print("Number 2 : ");
        num2 = input.nextInt();

        // Switch-Case for operations
        switch (select){
            case 1:
                System.out.println("Addition : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division : " + (num1 / num2));
                break;
            default:
                System.out.println("You did not select a valid operation.");
                break;
        }
    }
}
