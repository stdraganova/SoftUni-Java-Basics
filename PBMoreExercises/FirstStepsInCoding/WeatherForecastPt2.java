package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecastPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degr = Double.parseDouble(scanner.nextLine());

        if (degr >= 26.00 && degr <= 35.00){
            System.out.println("Hot");
        }else if (degr >= 20.1 && degr <= 25.9){
            System.out.println("Warm");
        } else if (degr >= 15 && degr <= 20.00) {
            System.out.println("Mild");
        } else if (degr >= 12.00 && degr <= 14.9) {
            System.out.println("Cool");
        } else if (degr >= 5.00 && degr <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}
