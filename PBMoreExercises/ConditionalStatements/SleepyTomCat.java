package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());

        int tomPlayNorm = 30000;
        int worckDays = 365 - freeDays;
        int totalPlayTime = (worckDays * 63) + (freeDays * 127);
        int diff = Math.abs(tomPlayNorm - totalPlayTime);
        int diffH = diff / 60;
        int diffM = diff % 60;

        if (totalPlayTime <= tomPlayNorm){
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", diffH, diffM);
        }else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", diffH, diffM);
        }
    }
}
