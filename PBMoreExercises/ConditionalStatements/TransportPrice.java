package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double price = 0;

        switch (time){
            case "day":
                if (n < 20){
                 price = 0.70 + (0.79 * n);
                    System.out.printf("%.2f",price);

                } else if (n >= 20 && n < 100) {
                    price = 0.09 * n;
                    System.out.printf("%.2f",price);
                } else {
                    price = 0.06 * n;
                    System.out.printf("%.2f",price);
                }
                break;

            case "night":
                if (n < 20){
                    price = 0.70 + (0.90 * n);
                    System.out.printf("%.2f",price);
                } else if (n >= 20 && n < 100) {
                    price = 0.09 * n;
                    System.out.printf("%.2f",price);
                } else {
                    price = 0.06 * n;
                    System.out.printf("%.2f",price);
                }
                break;
        }

    }
}
