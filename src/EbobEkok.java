import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int number1, number2, ebob, ekok;
        int tempNum1, tempNum2;

        // Getting the numbers
        System.out.print("Enter first number : ");
        number1 = sc.nextInt();
        System.out.print("Enter first number : ");
        number2 = sc.nextInt();

        // Calculate Ebob
        tempNum1 = number1; tempNum2 = number2;
        while ( tempNum1 != tempNum2)
        {
            if (tempNum1 > tempNum2)
                tempNum1 -= tempNum2;
            if (tempNum2 > tempNum1)
                tempNum2 -= tempNum1;
        }
        ebob = tempNum1;

        System.out.println("Ebob : " + ebob);

        // Calculate Ekok
        ekok = (number1 * number2) / ebob;
        System.out.println("Ekok : " + ekok);
    }
}
