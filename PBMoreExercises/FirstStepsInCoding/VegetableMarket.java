package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        int kgVegies = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double priceVegies = n * kgVegies;
        double priceFruits = m * kgFruits;
        double totalPrice = priceFruits + priceVegies;
        double priceInEur = totalPrice / 1.94;

        System.out.printf("%.2f", priceInEur);

    }
}
