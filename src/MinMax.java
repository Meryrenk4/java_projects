import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE, number, counter;

        // Getting the counter
        System.out.print("Enter the counter : ");
        counter = sc.nextInt();

        do {
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            if (number > maximum)
                maximum = number;
            if (number < minimum)
                minimum = number;

            counter--;
        } while (counter > 0);

        System.out.println("Minimum Value : " + minimum);
        System.out.println("Maximum Value : " + maximum);

    }
}
