import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int num1, num2, num3;

        // Getting the variables
        System.out.print("Number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Number 2 : ");
        num2 = sc.nextInt();
        System.out.print("Number 3 : ");
        num3 = sc.nextInt();

        // Sorting with If-Else
        if (num1 >= num2){
            if (num2 >= num3)
                System.out.print(num1 + " > " + num2 + " > " + num3);
            else if (num3 >= num1)
                System.out.print(num3 + " > " + num1 + " > " + num2);
            else if (num1 > num3)
                System.out.print(num1 + " > " + num3 + " > " + num2);
        }

        if (num2 > num1){
            if (num3 >= num2)
                System.out.print(num3 + " > " + num2 + " > " + num1);
            else if (num3 >= num1)
                System.out.print(num2 + " > " + num3 + " > " + num1);
            else if (num1 > num3)
                System.out.print(num2 + " > " + num1 + " > " + num3);
        }
    }
}
