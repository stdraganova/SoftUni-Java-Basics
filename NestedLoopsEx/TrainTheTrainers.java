package NestedLoopsEx;

import java.util.Scanner;

public class TrainTheTrainers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nJury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double finalAssessment = 0;
        int count = 0;
        while (!input.equals("Finish")){

            count++;
            double sum = 0;

            for (int i = 1; i <= nJury; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }

            double average = sum / nJury;
            finalAssessment += average;
            System.out.printf("%s - %.2f.%n", input, average);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", (finalAssessment / count));

    }
}
