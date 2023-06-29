/*
    This project finds the even numbers which is repeated in an array.
 */

public class RepeatedEvenNumbers {
    public static void main(String[] args) {
        // Create the list
        int[] list = {1, 4, 5, 6, 7, 4, 3, 8, 8, 0, 2, 2};

        // Find the repeated even numbers
        System.out.print("Repeated Even Numbers :");
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    System.out.print(" " + list[i]);
                }
            }
        }
    }
}
