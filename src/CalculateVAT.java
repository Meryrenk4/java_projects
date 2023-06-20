// This project calculates the VAT price and VAT amount of the value received from the user.

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class CalculateVAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define the variables for price, VAT, VAT value and the price with VAT
        double price, vatValue, priceWithVat;
        double vat = 0.18;

        // getting price from user
        System.out.print("Please enter the value of price : ");
        price = input.nextDouble();

        // Calculate VAT value and the price with VAT
        vatValue = price * vat;
        priceWithVat = price + vatValue;

        System.out.println("VAT Value : " + vatValue);
        System.out.println("The Prive with VAT : " + priceWithVat);

    }
}
