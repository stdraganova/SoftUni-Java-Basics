package exercise;

import java.util.Scanner;

public class RadToDegr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double degr = rad * 180 / Math.PI;
        System.out.println(degr);
    }
}
