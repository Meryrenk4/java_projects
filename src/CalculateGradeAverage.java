// This program calculates the course average over 5 courses (math, physics, english, history and music).

import java.util.Scanner;

public class CalculateGradeAverage {
    public static void main(String[] args) {
        // defining variables for courses
        int mathGrade, physicsGrade, englishGrade, historyGrade, musicGrade;

        // getting course grades from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Math grade : ");
        mathGrade = input.nextInt();

        System.out.print("Please enter Physics grade : ");
        physicsGrade = input.nextInt();

        System.out.print("Please enter English grade : ");
        englishGrade = input.nextInt();

        System.out.print("Please enter History grade : ");
        historyGrade = input.nextInt();

        System.out.print("Please enter Music grade : ");
        musicGrade = input.nextInt();

        // calculating average of grades
        double average = (mathGrade + physicsGrade + englishGrade + historyGrade + musicGrade) / 5.0;
        System.out.println("Your average of grades is " + average);

        // checking the pass/fail status
        System.out.println(average < 60 ? "Sorry, you failed the class." : "Congratulations, you pass the class.");
    }
}