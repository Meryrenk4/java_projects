/*
    Add the oral grade variable to the Course class and specify its effect on the average
    for each course separately. Include the effect of their oral grades on the average as a percentage.

    Example: If the effect of the oral grade of the physics course is 20% on the average,
    the effect of the exam grade is 80%.

    If the student gets 90 from the oral and 60 from the exam, the effect of that course
    on the overall average is calculated as follows:

    Physics Average: (90 * 0.20) + (60 * 0.80);
 */

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralGrade;
    double oralGradePercentage;
    double examGradePercentage;

    public Course(String name, String code, String prefix, double oralGradePercentage, double examGradePercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralGradePercentage = oralGradePercentage;
        this.examGradePercentage = examGradePercentage;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Transaction successful.");
        } else {
            System.out.println(t.name + " cannot teach this lesson.");
        }
    }
}
