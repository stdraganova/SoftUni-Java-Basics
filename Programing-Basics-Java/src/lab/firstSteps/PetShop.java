package lab.firstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DogsFoodNumber = Integer.parseInt(scanner.nextLine());
        int CatFoodNumber = Integer.parseInt(scanner.nextLine());
        double sum = (DogsFoodNumber * 2.5) + (CatFoodNumber * 4);
        System.out.println(sum);

    }
}
