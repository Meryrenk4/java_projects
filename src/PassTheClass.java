import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the variables
        int math, physics, english, chemistry, music;
        double average;

        // Getting the variables
        System.out.println("The grades must be between 0 and 100.");
        System.out.print("Math Grade : ");
        math = sc.nextInt();
        System.out.print("Physics Grade : ");
        physics = sc.nextInt();
        System.out.print("English Grade : ");
        english = sc.nextInt();
        System.out.print("Chemistry Grade : ");
        chemistry = sc.nextInt();
        System.out.print("Music Grade : ");
        music = sc.nextInt();

        // Calculating the average
        average = (math + physics + english + chemistry + music) / 5.0;
        System.out.println("Your average of grades is " + average);

        // Checking the pass/fail status
        if (average >= 55) {
            System.out.println("You pass the class.");
        }else {
            System.out.println("Sorry, you failed the class.");
        }

    }
}
