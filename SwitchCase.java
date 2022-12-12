package classProblemByAmolMateSir.Day8PracticeProblem.EmployeeWage;

import java.util.Random;

public class SwitchCase {
    static void check(){
        System.out.println("Welcome to Employee Wage");

        int perHr = 20;
        int dayHr = 8;

        Random random = new Random();
        int present = random.nextInt(3);
        switch (present) {
            case 1:
                perHr = 20;
                dayHr = 8;
                System.out.println("present");
                break;
            case 2:
                perHr = 0;
                dayHr = 0;
                System.out.println("absent");
                break;
            default:
                perHr = 20;
                dayHr = 4;
                System.out.println("part time");
        }
        int dailyWage = perHr * dayHr;
        System.out.println("daily wage is : " + dailyWage);
    }
}
