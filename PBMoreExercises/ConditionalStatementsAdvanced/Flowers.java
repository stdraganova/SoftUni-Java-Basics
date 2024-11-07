package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulip = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulip = 0;
        double totalPrice = 0;
        int totalFwolers = numTulip + numRoses + numChrysanthemums;

        switch (season){
            case "Spring":
                priceChrysanthemums += 2.00 * numChrysanthemums;
                priceRoses += 4.10 * numRoses;
                priceTulip += 2.50 * numTulip;
                totalPrice = priceChrysanthemums + priceRoses + priceTulip;

                if (holiday.equals("Y")){
                    totalPrice += totalPrice * 0.15;
                }
                if (numTulip >= 7){
                    totalPrice -= totalPrice * 0.05;
                }
                if (totalFwolers >= 20){
                    totalPrice -= totalPrice * 0.20;
                }

                break;

            case "Summer":
             priceChrysanthemums += 2.00 * numChrysanthemums;
             priceRoses += 4.10 * numRoses;
             priceTulip += 2.50 * numTulip;
             totalPrice = priceChrysanthemums + priceRoses + priceTulip;

                if (holiday.equals("Y")){
                    totalPrice += totalPrice * 0.15;
                }
                if (totalFwolers >= 20){
                    totalPrice -= totalPrice * 0.20;
                }

             break;

            case "Autumn":
                priceChrysanthemums += 3.75 * numChrysanthemums;
                priceRoses += 4.50 * numRoses;
                priceTulip += 4.15 * numTulip;
                totalPrice = priceChrysanthemums + priceRoses + priceTulip;


                if (holiday.equals("Y")){
                    totalPrice += totalPrice * 0.15;
                }
                if (totalFwolers >= 20){
                    totalPrice -= totalPrice * 0.20;
                }

                break;

            case "Winter":
                priceChrysanthemums += 3.75 * numChrysanthemums;
                priceRoses += 4.50 * numRoses;
                priceTulip += 4.15 * numTulip;
                totalPrice = priceChrysanthemums + priceRoses + priceTulip;

                if (holiday.equals("Y")){
                    totalPrice += totalPrice * 0.15;
                }
                if(numRoses >= 10){
                    totalPrice -= totalPrice * 0.10;
                }
                if (totalFwolers >= 20){
                    totalPrice -= totalPrice * 0.20;
                }

                break;
        }

        totalPrice += 2.00;
        System.out.printf("%.2f", totalPrice);

    }
}
