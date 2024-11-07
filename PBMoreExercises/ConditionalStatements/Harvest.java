package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int employes = Integer.parseInt(scanner.nextLine());

        double totalY= x * y;
        double wine = (totalY * 0.4 ) / 2.5;

        double diff = (Math.abs(z - wine));
        double perPerson = diff / employes;

        if (z <= wine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", Math.floor(wine), Math.ceil(diff), Math.ceil(perPerson));
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(diff));
        }


    }
}
