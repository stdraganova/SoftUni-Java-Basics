package ConditionalStatementsAdvancedExercise;
import java.util.Scanner;

public class Cinema {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();
            int numR = Integer.parseInt(scanner.nextLine());
            int numC = Integer.parseInt(scanner.nextLine());

            double price = 0;

            if (type.equals("Premiere")) {
                price = 12.00;
            } else if (type.equals("Normal")) {
                price = 7.50;
            } else if (type.equals("Discount")) {
                price = 5.00;
            }

            double result = numR * numC * price;
            System.out.printf("%.2f", result);

        }
}
