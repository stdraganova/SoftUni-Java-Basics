package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelLeft = Double.parseDouble(scanner.nextLine());

        boolean isValid = fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas");

        if (isValid && fuelLeft >= 25){
            System.out.printf("You have enough %s.",fuelType.toLowerCase());
        } else if (isValid && fuelLeft < 25) {
            System.out.printf("Fill your tank with %s!",fuelType.toLowerCase());
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
