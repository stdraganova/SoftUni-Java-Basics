package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int count = 0;
        double sum = 0;
        int year = 1;

        while (year <= 12){

            if (count > 1){
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                count++;
                continue;
            }

            sum += grade;
            year++;

        }

        double average = sum / 12;

        if (count > 1){
            System.out.printf("%s has been excluded at %d grade", name, year);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }


    }
}
