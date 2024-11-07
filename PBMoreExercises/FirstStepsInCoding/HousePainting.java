package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x =Double.parseDouble(scanner.nextLine());
        double y =Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());

        double door = 1.2 * 2;
        double frontWall = (x * x) - door;
        double backWall = x * x;
        double sideWalls = (x * y) - (1.5 * 1.5);
        double roofSides = x * y;
        double roofFronts = (x * h) / 2;

        double totalWalls = frontWall + backWall + 2*(sideWalls);
        double roof = (2 * roofSides) + (2 * roofFronts);

        double greenPaint = totalWalls / 3.4;
        double redPaint = roof / 4.3;

        System.out.printf("%.2f%n%.2f",greenPaint, redPaint);

    }
}
