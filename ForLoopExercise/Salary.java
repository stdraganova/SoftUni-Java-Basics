package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTab = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= nTab; i++){
            String site = scanner.nextLine();

            switch (site){
                case "Facebook":
                    salary -= 150;
                    break;

                case "Instagram":
                    salary -= 100;
                    break;

                case "Reddit":
                    salary -= 50;
                    break;
            }

        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

    }
}
