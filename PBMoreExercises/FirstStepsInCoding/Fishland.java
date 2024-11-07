package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double priceMackerel = Double.parseDouble(scanner.nextLine()); // Цена на 1кг скумрия
        double priceSprinkle = Double.parseDouble(scanner.nextLine()); // Цена на 1кг цаца
        double kgBonito = Double.parseDouble(scanner.nextLine()); // Кг паламуд
        double kgSafrid = Double.parseDouble(scanner.nextLine()); // Кг сафрид
        double kgMussels = Double.parseDouble(scanner.nextLine()); // Кг миди

        double priceBonito = priceMackerel + (priceMackerel * 0.60);
        double priceSafrid = priceSprinkle + (priceSprinkle * 0.80);
        double priceMussels = 7.50;

        double totalPrice = (kgBonito * priceBonito) + (kgSafrid * priceSafrid) + (kgMussels * priceMussels);

        System.out.printf("%.2f",totalPrice);

    }
}
