/*
    This project calculates the salaries of the employees with a class named "Employee"
    which is representing the factory workers. This class have 4 attributes and 5 methods.
 */
public class Employee {
    String name;  // Worker's name and surname
    double salary;  // Worker's salary
    int workHours;  // Worker's weekly working hours
    int hireYear;  // Worker's year of hire

    // Constructor
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*
        Calculate the tax
        If the employee's salary is less than 1000 TL, no tax will be applied.
        If the employee's salary is more than 1000 TL, 3% of his salary will be taxed.
    */
    public double tax() {
        double tax = 0;

        if (this.salary <= 1000) {
            System.out.println("Your salary is less than or equal to 1000 TL, so no tax was applied to your salary.");
        } else {
            System.out.println("3% tax has been applied to your salary because your salary is more than 1000 TL.");
            tax = (this.salary * 0.03);
        }
        return tax;
    }

    /*
        Calculate the bonus
        If the employee works more than 40 hours a week, calculate a bonus of 30 TL per overtime hour.
    */
    public double bonus() {
        double bonus;

        if (this.workHours > 40) {
            System.out.println("In this week, you have worked an extra " + (this.workHours - 40) + " hours.");
            bonus = (this.workHours - 40) * 30;
             return bonus;
        } else {
            return 0.0;
        }
    }

    /*
        Calculate the salary increase
        It will calculate the salary increase based on the employee's starting year.
        Take the current year as 2021.

        If the employee has been working for less than 10 years, a 5% raise will be made.
        If the employee has worked for more than 9 years and less than 20 years, a 10% raise will be made.
        If the employee has been working for more than 19 years, a 15% raise will be made.
    */
    public double raiseSalary() {
        int workingYears = 2021 - this.hireYear;
        double increase;

        if (workingYears < 10) {
            System.out.println("You have been working for " + workingYears + " years. Your salary will be increased by 5%.\n\n");
            increase = (this.salary * 0.05);
        } else if (workingYears < 20) {
            System.out.println("You have been working for " + workingYears + " years. Your salary will be increased by 10%.\n\n");
            increase = (this.salary * 0.1);
        } else {
            System.out.println("You have been working for " + workingYears + " years. Your salary will be increased by 15%.\n\n");
            increase = (this.salary * 0.15);
        }

        return increase;
    }

    // Printing the worker's information
    public String toString() {
        System.out.println("Salary Information: ");
        double tax = tax();
        double bonus = bonus();
        double increase = raiseSalary();
        double salaryWithBonusAndTax = this.salary - tax + bonus;
        double totalSalary = salaryWithBonusAndTax + increase;

        String worker = "Worker's name and surname : " + this.name + "\n"
                      + "Worker's raw salary : " + this.salary + "\n"
                      + "Worker's weekly working hours : " + this.workHours + "\n"
                      + "Worker's year of hire : " + this.hireYear + "\n"
                      + "Tax : " + tax + "\n"
                      + "Bonus : " + bonus + "\n"
                      + "Salary increase : " + increase + "\n"
                      + "Salary with tax and bonus : " + salaryWithBonusAndTax + "\n"
                      + "Total Salary : " + totalSalary;
        return worker;
    }
}
