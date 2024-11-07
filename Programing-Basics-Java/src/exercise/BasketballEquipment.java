package exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxeForYear = Integer.parseInt(scanner.nextLine());

        double sneakers = taxeForYear - (taxeForYear * 40/100);
        double equipe = sneakers - (sneakers * 20/100);
        double ball = equipe * 0.25;
        double accessories = ball * 0.20;

        double sum = taxeForYear + sneakers + equipe + ball + accessories;
        System.out.println(sum);
    }
}
