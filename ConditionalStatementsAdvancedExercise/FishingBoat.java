package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;

public class FishingBoat {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int budget = Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            int fishman = Integer.parseInt(scanner.nextLine());

            //: "Spring", "Summer", "Autumn", "Winter"

            double price = 0;

            switch (season) {
                case "Spring":
                    price = 3000;
                    if (fishman % 2 == 0) {
                        price = price * 0.95;
                    }
                    if (fishman <= 6) {
                        price = price * 0.9;
                    } else if (fishman > 7 && fishman <= 11) {
                        price = price * 0.85;
                    } else if (fishman >= 12) {
                        price = price * 0.75;
                    }
                    break;

                case "Summer":
                    price = 4200;
                    if (fishman % 2 == 0) {
                        price = price * 0.95;
                    }
                    if (fishman <= 6) {
                        price = price * 0.9;
                    } else if (fishman > 7 && fishman <= 11) {
                        price = price * 0.85;
                    } else if (fishman >= 12) {
                        price = price * 0.75;
                    }
                    break;

                case "Autumn":
                    price = 4200;
                    if (fishman <= 6) {
                        price = price * 0.9;
                    } else if (fishman > 7 && fishman <= 11) {
                        price = price * 0.85;
                    } else if (fishman >= 12) {
                        price = price * 0.75;
                    }
                    break;

                case "Winter":
                    price = 2600;
                    if (fishman % 2 == 0) {
                        price = price * 0.95;
                    }
                    if (fishman <= 6) {
                        price = price * 0.9;
                    } else if (fishman > 7 && fishman <= 11) {
                        price = price * 0.85;
                    } else if (fishman >= 12) {
                        price = price * 0.75;
                    }
                    break;
            }

            double diff = Math.abs(budget - price);

            if (budget >= price){
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }

        }
}
