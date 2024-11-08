package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carModel = "";
        double price = 0;

        if (budget <= 100){
            carClass = "Economy class";

            switch (season){
                case "Summer":
                    carModel = "Cabrio";
                    price += budget * 0.35;
                    break;

                case "Winter":
                    carModel = "Jeep";
                    price += budget * 0.65;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season){
                case "Summer":
                    carModel = "Cabrio";
                    price += budget * 0.45;
                    break;

                case "Winter":
                    carModel = "Jeep";
                    price += budget * 0.80;
                    break;
            }
        }else {
            carClass = "Luxury class";
            carModel = "Jeep";
            price += budget * 0.90;
        }

        System.out.printf("%s%n%s - %.2f",carClass,carModel,price );

    }
}
