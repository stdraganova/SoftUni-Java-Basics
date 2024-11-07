package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        int countF = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        double allGrades = 0;

        for (int i = 1; i <= students; i++){
            double grade = Double.parseDouble(scanner.nextLine());
            allGrades += grade;

            if (grade >= 2.00 && grade <= 2.99){
                countF++;
            } else if (grade >= 3.00 && grade <= 3.99) {
                countC++;
            } else if (grade >= 4.00 && grade <= 4.99) {
                countB++;
            }else {
                countA++;
            }
        }
        double percentA = (countA * 1.0 / students) * 100;
        double percentB = (countB * 1.0 / students) * 100;
        double percentC = (countC * 1.0 / students) * 100;
        double percentF = (countF * 1.0 / students) * 100;

        double averageGrade = allGrades / students;

        System.out.printf("Top students: %.2f%%%n", percentA);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentB);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentC);
        System.out.printf("Fail: %.2f%%%n", percentF);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
