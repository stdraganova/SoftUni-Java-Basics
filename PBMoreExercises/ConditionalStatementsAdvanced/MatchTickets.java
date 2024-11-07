package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        double transport = 0;
        switch (category) {
            case "VIP":
                totalPrice += 499.99 * numPeople;
                break;

            case "Normal":
                totalPrice += 249.99 * numPeople;
                break;
        }

        if (numPeople >= 1 && numPeople <= 4) {
            transport = budget * 0.75;
        } else if (numPeople >= 5 && numPeople <= 9) {
            transport = budget * 0.60;
        } else if (numPeople >= 10 && numPeople <= 24) {
            transport = budget * 0.50;
        } else if (numPeople >= 25 && numPeople <= 49) {
            transport = budget * 0.40;
        } else {
            transport = budget * 0.25;
        }

        double diff = budget - transport - totalPrice;

        if (diff >=0 ){
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(diff));
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(diff));
        }

    }
}
