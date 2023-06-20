import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the variables
        double apple = 3.67, pear = 2.14, tomato = 1.11, banana = 0.95, eggplant = 5.0;
        double cApple, cPear, cTomato, cBanana, cEggplant, totalPrice;

        // Get the variables
        System.out.print("How many kilos of apple do you want? : ");
        cApple = input.nextDouble();
        System.out.print("How many kilos of pear do you want? : ");
        cPear = input.nextDouble();
        System.out.print("How many kilos of tomato do you want? : ");
        cTomato = input.nextDouble();
        System.out.print("How many kilos of banana do you want? : ");
        cBanana = input.nextDouble();
        System.out.print("How many kilos of eggplant do you want? : ");
        cEggplant = input.nextDouble();

        // Calculate the total price
        totalPrice = (apple * cApple) + (pear * cPear) + (tomato * cTomato) + (banana * cBanana) + (eggplant * cEggplant);
        System.out.println("The total price : " + totalPrice);
    }
}
