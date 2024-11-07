package Exam;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        int countDays = 1;
        int high = 5364;

        while (!txt.equals("END")){

            if (txt.equals("Yes")){
                countDays++;
            }

            int meters = Integer.parseInt(scanner.nextLine());
            high = high + meters;

            if (high >= 8848 || countDays == 5){
                break;
            }

            txt = scanner.nextLine();
        }

        if (high >= 8848){
            System.out.printf("Goal reached for %d days!", countDays);
        }else {
            System.out.println("Failed!");
            System.out.printf("%d", high);
        }

    }
}
