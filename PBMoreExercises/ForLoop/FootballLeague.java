package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;


        for (int i = 1; i <= fans; i++){
            String sector = scanner.nextLine();

            if (sector.equals("A")){
                countA++;
            } else if (sector.equals("B")) {
                countB++;
            } else if (sector.equals("V")) {
                countV++;
            } else if (sector.equals("G")) {
                countG++;
            }
        }

        double percentA= (countA * 1.0 / fans) * 100;
        double percentB= (countB * 1.0 / fans) * 100;
        double percentV= (countV * 1.0 / fans) * 100;
        double percentG= (countG * 1.0 / fans) * 100;
        double percentAll= (fans * 1.0 / capacity) * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%",percentAll);

    }
}
