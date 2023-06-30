import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    // Define the variables
    String[][] minefield;
    String[][] minefieldWithMines;

    MineSweeper(int row, int col) {
        this.minefieldWithMines = new String[row][col];
        this.minefield = new String[row][col];
    }

    // Fill minefield with '-' signs
    public void fillTheArray(String[][] mField) {
        for (String[] row : mField) {
            Arrays.fill(row, "-");
        }
    }

    // Add mines to minefield
    public void addMines(String[][] mField) {
        // Define the variables
        int randRow, randCol, counter = 0;

        // Place mines
        while (counter < ((mField.length * mField[0].length) / 4)) {
            Random rand = new Random();

            randRow = rand.nextInt(mField.length);
            randCol = rand.nextInt(mField[randRow].length);

            if(mField[randRow][randCol].equals("-")) {
                mField[randRow][randCol] = "*";
                counter++;
            }
        }
    }

    // Print the minefield
    public void print(String[][] mField) {
        for (String[] row : mField) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("*********************************");
    }

    // Check win
    public boolean checkWin(String[][] mField) {
        for (String[] row : mField) {
            for  (String col : row) {
                if (Objects.equals(col, "-"))
                    return false;
            }
        }

        return true;
    }

    // Calculate how many mines are around the selected area
    public int checkMines(int row, int col) {
        int counter = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < this.minefieldWithMines.length && j >= 0 && j < this.minefieldWithMines[0].length) {
                    if (this.minefieldWithMines[i][j].equals("*"))
                        counter++;
                }
            }
        }

        return counter;
    }

    // Method that runs the game
    public void run() {
        Scanner sc = new Scanner(System.in);

        // Define the variables
        int row, col, counter;

        // Fill the arrays
        fillTheArray(this.minefieldWithMines);
        fillTheArray(this.minefield);

        // Add mines an array
        // Other one is printed on the screen, so the user cannot see any mines
        addMines(this.minefieldWithMines);

        // The player lost when there is a mine in the selected area
        // The player wins when there is no selected area on the screen other than mines
        while (true) {
            System.out.println("**********The Minefield**********");
            print(this.minefield);

            // Check the player has won
            if (checkWin(this.minefieldWithMines)) {
                System.out.println("Congratulations, you won the game!");
                break;
            }

            // Get column and row
            System.out.print("Please enter the row : ");
            row = sc.nextInt();
            System.out.print("Please enter the column : ");
            col = sc.nextInt();

            // Check the minefield for mines in the entered rows and columns
            // Decrease the row and col by one, to get rid of zero-indexing
            row -= 1; col -= 1;

            // Check if row and column are suitable for
            if (row < 0 || col < 0 || row >= this.minefield.length || col >= this.minefield.length) {
                System.out.println("You selected wrong coordinates. Please try again.");
            } else {
                // Check for mines in the selected area
                if (Objects.equals(this.minefieldWithMines[row][col], "*")) {
                    System.out.println("You stepped on a mine, you lost the game!");
                    break;
                } else {
                    // Check how many mines are around the selected area
                    counter = checkMines(row, col);

                    this.minefield[row][col] = String.valueOf(counter);
                }
            }
        }

        // Print the minefield with mines
        System.out.println("**********The Minefield**********");
        print(this.minefieldWithMines);
    }

}
