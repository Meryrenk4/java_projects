import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int number;
        double harmonic = 0.0;

        // Getting the number
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        // Calculate the harmonic number
        for (int i = 1; i <= number; i++) {
            harmonic += ((double) 1 / i);
        }

        System.out.println("The harmonic number of " + number + " : " + harmonic);
    }
}
