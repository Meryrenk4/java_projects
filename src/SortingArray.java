/*
    This project sorts an array whose elements are entered from the user.
 */

import java.util.Scanner;
public class SortingArray {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the variables
        int length, num;
        int[] list;

        // Get length of list
        System.out.print("How many numbers will be in the list : ");
        length = sc.nextInt();

        list = new int[length];

        // Get numbers and add the list
        for (int i = 1; i <= length; i++) {
            System.out.print("Number " + i + " : ");
            num = sc.nextInt();
            list[i - 1] = num;
        }

        // Sort the list with bubble sort algorithm and print the sorted list
        bubbleSort(list);
        System.out.print("Sorted List :");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + list[i]);
        }

    }
}
