import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variable
        int num;

        // Getting the variable
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        // Find the even numbers from zero to the number
        System.out.print("Even numbers : ");
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // HOMEWORK : Calculate the average of numbers divisible by 3 and 4 up to the entered number
        int sum = 0, counter = 0;

        for (int j = 0; j < num; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                sum += j;
                counter++;
            }
        }

        System.out.println("\n\nAverage of numbers divisible by 3 and 4 : " + (sum / counter));
    }
}
