package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double p = 2 * Math.PI * r;
        double s = Math.PI * (r*r);

        System.out.printf("%.2f%n%.2f",s, p);

    }
}
