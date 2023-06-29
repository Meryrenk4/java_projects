/*
    This project calculates the frequencies of each element in an array.
 */

public class ElementFrequencies {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        // Define a variable
        int counter;
        boolean isCount;


        // Print the list
        System.out.print("List : ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Find and print the value of the repetitions of the numbers.
        for (int i = 0; i < list.length; i++) {
            counter = 0;
            isCount = false;

            for (int j = i - 1; j >= 0; --j) {
                if (list[j] == list[i]) {
                    isCount = true;
                    break;
                }
            }

            if (!isCount) {
                for (int j : list) {
                    if (list[i] == j)
                        counter++;
                }
            }

            if (counter >= 1)
                System.out.println(list[i] + " repeats " + counter + " times.");
        }

    }
}
