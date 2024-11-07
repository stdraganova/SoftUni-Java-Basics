package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double number1 = 0.0;

        for (int i = 1; i <= 100 ; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number > 0) {
                number = number * 2;
                System.out.printf("Result: %.2f %n", number);
            } else {
                System.out.println("Negative number!");
                break;
            }
        }
    }
}
