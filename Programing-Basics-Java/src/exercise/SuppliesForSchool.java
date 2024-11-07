package exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensNumber = Integer.parseInt(scanner.nextLine());
        int markersNumber = Integer.parseInt(scanner.nextLine());
        int litersOfDetergent = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double sumPens= pensNumber * 5.80;
        double sumMarkers = markersNumber * 7.20;
        double sumDetergent = litersOfDetergent * 1.20;

        double sum = sumPens + sumMarkers + sumDetergent ;

        double result = sum - ((sum * discountPercentage)/100);

        System.out.println(result);
    }
}
