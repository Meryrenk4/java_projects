package StudentGradingSystem.src;

public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course physics,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int physics, int chemistry, int mathOralGrade, int phyOralGrade, int cheOralGrade) {

        if (math >= 0 && math <= 100 && mathOralGrade >= 0 && mathOralGrade <= 100) {
            this.math.note = math;
            this.math.oralGrade = mathOralGrade;
        }

        if (physics >= 0 && physics <= 100 && phyOralGrade >= 0 && phyOralGrade <= 100) {
            this.physics.note = physics;
            this.physics.oralGrade = phyOralGrade;
        }

        if (chemistry >= 0 && chemistry <= 100 && cheOralGrade >= 0 && cheOralGrade <= 100) {
            this.chemistry.note = chemistry;
            this.chemistry.oralGrade = cheOralGrade;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notes are not fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            if (this.isPass) {
                System.out.println("Pass the class.");
            } else {
                System.out.println("Fail the class.");
            }
        }
    }

    public void calcAverage() {
        this.average = (double) (this.physics.note + this.chemistry.note + this.math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Note : " + this.math.note);
        System.out.println("Math Oral Note : " + this.math.oralGrade);
        System.out.println("Physics Note : " + this.physics.note);
        System.out.println("Physics Oral Note : " + this.physics.oralGrade);
        System.out.println("Chemistry Note : " + this.chemistry.note);
        System.out.println("Chemistry Oral Note : " + this.chemistry.oralGrade);
    }

    public void gradesEffects(Course c) {
        System.out.println(c.name + " course's oral grade effects on " + this.name + "'s course average : " + (c.oralGrade * c.oralGradePercentage));
        System.out.println(c.name + " course's exam grade effects on " + this.name + "'s course average : " + (c.note * c.examGradePercentage));
    }
}
