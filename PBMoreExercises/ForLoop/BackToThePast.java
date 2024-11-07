package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double restMoney = inheritance;
        int age = 18;

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                restMoney -= 12000;
            } else {
                restMoney -= 12000 + (age * 50);
            }
            age ++;
        }

        if (restMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", restMoney);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(restMoney));
        }
    }
}
