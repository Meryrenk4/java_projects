import java.util.Scanner;

public class MainMineSweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define and get the variables from the player
        System.out.print("How many rows do you want in your minefield : ");
        int row = sc.nextInt();
        System.out.print("How many columns do you want in your minefield : ");
        int col = sc.nextInt();

        // Create an object from MineSweeper Class and use methods of the class
        MineSweeper m = new MineSweeper(row, col);
        m.run();

    }
}