import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int km, age, typeOfTrip;
        double totalPrice;

        // Getting the variables
        System.out.print("How many kilometers is the road : ");
        km = sc.nextInt();
        System.out.print("How old are you : ");
        age = sc.nextInt();
        System.out.print("One way (1) or return (2) : ");
        typeOfTrip = sc.nextInt();

        // Checking the information
        if ((km < 0) || (age < 0) || ((typeOfTrip != 1) && (typeOfTrip != 2))) {
            System.out.println("You entered wrong information!");
        } else {
            // Calculating the total price
            totalPrice = km * 0.1;

            if (age < 12) {
                totalPrice -= totalPrice * 0.5;
            } else if (age <= 24) {
                totalPrice -= totalPrice * 0.1;
            } else if (age >= 65) {
                totalPrice -= totalPrice * 0.3;
            }

            if (typeOfTrip == 2) {
                totalPrice -= totalPrice * 0.2;
                System.out.println("The price of the plane ticket is " + (2 * totalPrice) + " TL.");
            } else {
                System.out.println("The price of the plane ticket is " + totalPrice + " TL.");
            }
        }

    }
}
