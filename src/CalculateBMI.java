import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the variables
        double kilo, height, bmi;

        // Getting the variables
        System.out.print("Please enter your kilo (kg) : ");
        kilo = input.nextDouble();
        System.out.print("Please enter your height (m) : ");
        height = input.nextDouble();

        // Calculating the BMI
        bmi = kilo / (height * height);

        System.out.println("Your BMI is " + bmi);

    }
}
