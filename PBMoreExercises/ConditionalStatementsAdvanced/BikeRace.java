package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double money = 0;
        int allPlayers = 0;

        switch (type){
            case "trail":
                money += (5.50 * juniors) + (7 * seniors);
                break;

            case "cross-country":
                money += (8 * juniors) + (9.50 * seniors);
                allPlayers = seniors + juniors;
                if (allPlayers >= 50){
                    money -= (money * 0.25);
                }

                break;

            case "downhill":
               money += (12.25 * juniors) + (13.75 * seniors);
                break;

            case "road":
                money += (20 * juniors) + (21.50 * seniors);
                break;
        }

        double totalMoney = money - (money * 0.05);
        System.out.printf("%.2f", totalMoney);

    }
}
