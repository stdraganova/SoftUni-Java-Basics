package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = initialPoints;
        int wonTournaments = 0;

        for (int i = 1; i <= nTournaments; i++){
            String stage = scanner.nextLine();

            switch (stage){
                case "W":
                    wonTournaments++;
                    totalPoints += 2000;
                    break;

                case "F":
                    totalPoints += 1200;
                    break;

                case "SF":
                    totalPoints += 720;
                    break;
            }

        }

        int averagePoints = (totalPoints - initialPoints) / nTournaments;
        double percent = (wonTournaments * 1.0 / nTournaments) * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percent);
    }
}
