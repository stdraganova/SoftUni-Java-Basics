package PBMoreExercises.WhileLoop;

import java.util.Scanner;

public class ReportSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toSave = Integer.parseInt(scanner.nextLine());
        String moneyAmount = scanner.nextLine();

        int count = 0;
        int moneySaved = 0;
        int countCS = 0;
        int countCC = 0;
        int CS = 0;
        int CC = 0;

        while (!moneyAmount.equals("End")){

            int money = Integer.parseInt(moneyAmount);

            if (count % 2 == 0 && money <= 100){
                System.out.println("Product sold!");
                moneySaved += money;
                countCS++;
                CS += money;
            } else if (count % 2 == 0 && money >= 100) {
                System.out.println("Error in transaction!");
            } else if (count % 2 == 1 && money >= 10) {
                System.out.println("Product sold!");
                moneySaved += money;
                countCC++;
                CC += money;
            } else if (count % 2 == 1 && money <= 10) {
                System.out.println("Error in transaction!");
            }

            if (toSave <= moneySaved){
                break;
            }

            count++;
            moneyAmount = scanner.nextLine();
        }

        double averageCS = CS * 1.0 / countCS;
        double averageCC = CC * 1.0 / countCC;

        if (toSave <= moneySaved){
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f%n",averageCC);
        }else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
