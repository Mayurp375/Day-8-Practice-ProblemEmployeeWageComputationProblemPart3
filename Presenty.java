package classProblemByAmolMateSir.Day8PracticeProblem.EmployeeWage;

import java.util.Random;

public class Presenty {
    static void check(){
        System.out.println("Welcome to Employee Wage");

        Random random = new Random();
        int present = random.nextInt(2);
        if(present == 1){
            System.out.println("present");
        }else {
            System.out.println("absent");
        }
    }
}
