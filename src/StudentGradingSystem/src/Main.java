public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101", "MATH", 0.2, 0.8);
        Course physics = new Course("Physics", "PHY101", "PHY", 0.2, 0.8);
        Course chemistry = new Course("Chemistry", "CHE101", "CHE", 0.2, 0.8);

        Teacher t1 = new Teacher("Prof. Mahmut", "90550000000", "MATH");
        Teacher t2 = new Teacher("Dr. Fatma", "90550000001", "PHY");
        Teacher t3 = new Teacher("Dr. Ali Veli", "90550000002", "CHE");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Ahmet", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40, 80, 90, 60);
        s1.isPass();
        s1.gradesEffects(s1.math);
        s1.gradesEffects(s1.physics);
        s1.gradesEffects(s1.chemistry);

        Student s2 = new Student("Selin", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100,50,40, 70, 50, 90);
        s2.isPass();
        s2.gradesEffects(s2.math);
        s2.gradesEffects(s2.physics);
        s2.gradesEffects(s2.chemistry);

        Student s3 = new Student("Mehmet", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40, 70, 90, 80);
        s3.isPass();
        s3.gradesEffects(s3.math);
        s3.gradesEffects(s3.physics);
        s3.gradesEffects(s3.chemistry);
    }
}