package ForLoopExercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int eval = Integer.parseInt(scanner.nextLine());

        double totalPoints = points;

        for (int i = 1; i <= eval; i++ ){
            String evalName = scanner.nextLine();
            double evalPoints = Double.parseDouble(scanner.nextLine());

            totalPoints += ((evalName.length() * evalPoints) / 2);

            if (totalPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
                break;
            }
        }

        if (totalPoints < 1250.5){
            double neededPoints = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", name, neededPoints);
        }

    }
}
