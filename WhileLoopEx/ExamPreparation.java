package WhileLoopEx;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());

        String exerciseName = "";
        int grade = 0;

        int count = 0;
        int sum = 0;
        int allEx = 0;
        String lastEx = "";

        while (count < badGrades){
            lastEx = exerciseName;

            exerciseName = scanner.nextLine();
            if (!exerciseName.equals("Enough")){
                grade = Integer.parseInt(scanner.nextLine());
            } else {
                break;
            }

            if (grade <= 4){
                count++;
            }

            sum += grade;
            allEx++;
        }

        double average = sum * 1.0/ allEx;

        if (count >= badGrades){
            System.out.printf("You need a break, %d poor grades.", count);
        }else {
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n", allEx);
            System.out.printf("Last problem: %s%n",lastEx);
        }



    }
}
