package exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int safetyNylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (safetyNylon + 2) * 1.50;
        double x = paint * 10 / 100.0; // защото пейнт е инт трябва да се раздели на дабъл (100.0), за да се промени и да не остане инт
        double paintPrice = (paint + x)  * 14.50;
        double thinnerPrice = paintThinner * 5.00;
        double sum = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workForHour = (sum * 30 / 100) * hours;

        System.out.println(sum + workForHour);

    }
}
