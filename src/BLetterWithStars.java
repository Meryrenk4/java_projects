/*
    This project writes "B" to the screen with "*" using multidimensional arrays

    * * *
    *     *
    * * *
    *     *
    *     *
    * * *
 */

public class BLetterWithStars {
    public static void main(String[] args) {
        String[][] letter = new String[6][3];

        // Adding data to list
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2  || i == 5) {
                    letter[i][j] = "* ";
                } else if (j == 0) {
                    letter[i][j] = "* ";
                } else if (j == 2) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        // Print the list
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
