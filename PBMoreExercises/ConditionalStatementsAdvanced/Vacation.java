package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String destination = "";
        double price = 0;

        if (budget <= 1000){
            place = "Camp";

            switch (season){
                case "Summer":
                    destination = "Alaska";
                    price += budget * 0.65;
                    break;

                case "Winter":
                    destination = "Morocco";
                    price  += budget * 0.45;
                    break;
            }

        } else if (budget > 1000 && budget <= 3000) {
            place = "Hut";

            switch (season){
                case "Summer":
                    destination = "Alaska";
                    price += budget * 0.80;
                    break;

                case "Winter":
                    destination = "Morocco";
                    price  += budget * 0.60;
                    break;
            }
        } else {
            place = "Hotel";

            switch (season){
                case "Summer":
                    destination = "Alaska";
                    price += budget * 0.90;
                    break;

                case "Winter":
                    destination = "Morocco";
                    price  += budget * 0.90;
                    break;
            }

        }

        System.out.printf("%s - %s - %.2f",destination, place, price);

    }
}
