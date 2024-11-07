package exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chikenMenuPrice = chikenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;
        double sum = chikenMenuPrice + fishMenuPrice + veganMenuPrice;
        double dessert = sum * 20 / 100;
        double delivery = 2.50;

        double result = sum + dessert + delivery;

        System.out.println(result);
    }
}
