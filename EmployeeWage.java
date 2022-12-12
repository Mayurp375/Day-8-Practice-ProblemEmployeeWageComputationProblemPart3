package classProblemByAmolMateSir.Day8PracticeProblem.EmployeeWage;

import java.util.Random;

public class EmployeeWage {
    static  void check(){
        System.out.println("Welcome to Employee Wage");

        int perHr = 20;
        int dayHr = 8;
        Random random = new Random();
        int present = random.nextInt(2);
        if (present == 1) {
            perHr = 20;
            dayHr = 8;
            System.out.println("present");
        } else {
            perHr = 0;
            dayHr = 0;
            System.out.println("absent");
        }
        int dailyWage = perHr * dayHr;
        System.out.println("daily wage is : " + dailyWage);
    }
}
