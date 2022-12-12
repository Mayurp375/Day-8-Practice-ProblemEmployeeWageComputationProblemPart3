package classProblemByAmolMateSir.Day8PracticeProblem.EmployeeWage;

import java.util.Random;

public class TotalWorkingHour {
    static void check(){
        System.out.println("Welcome to Employee Wage");

        int perHr = 20;
        int dayHr = 8;
        int Month ;
        Random random = new Random();
        for (int i =0; i<= 20; i++) {
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
            dayHr += perHr ;
            System.out.println("daily wage is : " + dayHr);
        }
        Month = perHr * dayHr;
        System.out.println("Monthly wage is : " + Month);
    }
}
