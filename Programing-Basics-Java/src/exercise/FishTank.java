package exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int totalVolume = length * width * height;
        double volumeInLiters = totalVolume / 1000.0; // делим на 1000 заради литрите
        double volumeOfWather = (volumeInLiters - (volumeInLiters * percent/100.0));

        System.out.println(volumeOfWather);
    }
}
