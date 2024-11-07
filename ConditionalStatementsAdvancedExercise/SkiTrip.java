package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (roomType){
            case "room for one person":
                price = 18.00 * nights;
                break;

            case "apartment":
                price = 25.00 * nights;

                if (days < 10){
                    price = price * 0.7;
                } else if (days >= 10 && days<= 15) {
                    price = price * 0.65;
                } else if (days > 15) {
                    price = price * 0.50;
                }

                break;

            case "president apartment":
                price = 35.00 * nights;

                if (days < 10){
                    price = price * 0.90;
                } else if (days >= 10 && days <= 15) {
                    price = price * 0.85;
                } else if (days > 15) {
                    price = price * 0.80;
                }

                break;
        }



        if (rating.equals("positive")){
            price = price + (price * 0.25);
        } else if (rating.equals("negative")) {
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f",price);

    }
}