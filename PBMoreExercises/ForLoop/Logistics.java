package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCargo = Integer.parseInt(scanner.nextLine());

        int priceBus = 0;
        int priceTruck = 0;
        int priceTrain = 0;
        int wholeTonnage = 0;

        int busTonnage = 0;
        int truckTonnage = 0;
        int trainTonnage = 0;

        for (int i = 1; i <= numCargo; i++){
            int tonnage = Integer.parseInt(scanner.nextLine());
            wholeTonnage += tonnage;

            if (tonnage <= 3){
                priceBus += 200 * tonnage;
                busTonnage += tonnage;
            } else if (tonnage >= 4 && tonnage <= 11) {
                priceTruck += 175 * tonnage;
                truckTonnage += tonnage;
            }else {
                priceTrain += 120 * tonnage;
                trainTonnage += tonnage;
            }
        }

        double averagePrice = (priceTruck + priceBus + priceTrain) * 1.0 / wholeTonnage;
        double busPercent = (busTonnage * 1.0 / wholeTonnage) * 100;
        double truckPercent = (truckTonnage * 1.0 / wholeTonnage) * 100;
        double trainPercent = (trainTonnage * 1.0 / wholeTonnage) * 100;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
