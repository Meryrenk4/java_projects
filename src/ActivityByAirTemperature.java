import java.util.Scanner;

public class ActivityByAirTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int temperature;

        // Getting the temperature
        System.out.print("Enter the air temperature : ");
        temperature = sc.nextInt();

        // Determining activity according to air temperature
        if (temperature < 5) {
            System.out.println("You can go to skiing.");
        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("You can go to the cinema.");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("You can have a picnic.");
        } else if (temperature >= 25) {
            System.out.println("You can go swimming.");
        } else {
            System.out.println("We do not have any suggestion for this air temperature.");
        }
    }
}
