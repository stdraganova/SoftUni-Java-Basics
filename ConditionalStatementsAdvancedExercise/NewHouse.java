package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;

public class NewHouse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String flowerType = scanner.nextLine();
            int quantity = Integer.parseInt(scanner.nextLine());
            int budget = Integer.parseInt(scanner.nextLine());

            double priceTotal = 0;

            //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
            //   5       3.80       2.80        3            2.50

            switch (flowerType){
                case "Roses":
                    priceTotal = quantity * 5;
                    if (quantity > 80){
                        priceTotal = priceTotal * 0.9;
                    }
                    break;

                case "Dahlias":
                    priceTotal = quantity * 3.80;
                    if (quantity > 90){
                        priceTotal = priceTotal * 0.85;
                    }
                    break;

                case "Tulips":
                    priceTotal = quantity * 2.80;
                    if (quantity > 80){
                        priceTotal = priceTotal * 0.85;
                    }
                    break;

                case "Narcissus":
                    priceTotal = quantity * 3;
                    if (quantity < 120){
                        priceTotal = priceTotal * 1.15;
                    }
                    break;

                case "Gladiolus":
                    priceTotal =quantity *  2.50;
                    if (quantity < 80){
                        priceTotal = priceTotal * 1.20;
                    }
                    break;
            }

            double diff = Math.abs(budget - priceTotal);

            if (budget >= priceTotal){
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowerType, diff);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", diff);
            }

        }
}
