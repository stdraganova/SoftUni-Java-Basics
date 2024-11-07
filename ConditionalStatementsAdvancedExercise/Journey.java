package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;

public class Journey {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();

            double moneySpend = 0;
            String destination = "";
            String residence = "";
            switch (season){
                case  "summer":

                    if (budget <= 100){
                        moneySpend = budget * 0.3;
                        destination = "Bulgaria";
                        residence = "Camp";
                    } else if (budget <= 1000) {
                        moneySpend = budget * 0.4;
                        destination = "Balkans";
                        residence = "Camp";
                    } else if (budget > 1000) {
                        moneySpend = budget * 0.9;
                        destination = "Europe";
                        residence = "Hotel";
                    }
                    break;

                case "winter":
                    if (budget <= 100){
                        moneySpend = budget * 0.7;
                        destination = "Bulgaria";
                        residence = "Hotel";
                    } else if (budget <= 1000) {
                        moneySpend = budget * 0.8;
                        destination = "Balkans";
                        residence = "Hotel";
                    } else if (budget > 1000) {
                        moneySpend = budget * 0.9;
                        destination = "Europe";
                        residence = "Hotel";
                    }
                    break;
            }
            System.out.printf("Somewhere in %s%n%s - %.2f", destination, residence, moneySpend);
        }
}
