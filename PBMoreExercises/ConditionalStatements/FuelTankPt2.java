package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class FuelTankPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litters = Double.parseDouble(scanner.nextLine());
        String cart = scanner.nextLine();

        double price = 0.00;

        switch (fuelType){
            case "Gasoline":
                price = litters * 2.22;
                if (cart.equals("Yes") && litters > 20 && litters <=25){
                    price = (price - (litters * 0.18))  * 0.92;
                } else if (cart.equals("Yes") && litters > 25) {
                    price = (price -( 0.18 * litters)) * 0.90;
                } else if (cart.equals("No") && litters > 20 && litters <=25 ) {
                    price = price * 0.92;
                } else if (cart.equals("No") && litters > 25) {
                    price = price * 0.90;
                }

                break;

            case "Diesel":
                price =litters * 2.33;
                if (cart.equals("Yes") && litters > 20 && litters <=25){
                    price = (price - (0.12 * litters)) * 0.92;
                } else if (cart.equals("Yes") && litters > 25) {
                    price = (price - (0.12 * litters)) * 0.90;
                }else if (cart.equals("No") && litters > 20 && litters <=25 ) {
                    price = price * 0.92;
                } else if (cart.equals("No") && litters > 25) {
                    price = price * 0.90;
                }
                break;

            case "Gas":
                price = litters * 0.93;
                if (cart.equals("Yes") && litters > 20 && litters <=25){
                    price = (price - (0.08 * litters)) * 0.92;
                } else if (cart.equals("Yes") && litters > 25) {
                    price = (price - (0.08 * litters)) * 0.90;
                }else if (cart.equals("No") && litters > 20 && litters <=25 ) {
                    price = price * 0.92;
                } else if (cart.equals("No") && litters > 25) {
                    price = price * 0.90;
                }
                break;
        }

        System.out.printf("%.2f lv.",price);

    }
}
