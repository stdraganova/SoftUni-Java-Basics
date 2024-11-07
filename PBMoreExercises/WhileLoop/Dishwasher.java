package PBMoreExercises.WhileLoop;

import java.util.Scanner;

public class Dishwasher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input
        int detergentBottles = Integer.parseInt(scanner.nextLine());
        int totalDetergent = detergentBottles * 750;

        String command = scanner.nextLine();
        int countWashing = 0;
        int detergentSpent = 0;
        int leftoverDetergent = 0;
        boolean detergentFinished = false;
        int countDishware = 0;
        int countPots = 0;


        while(!command.equals("End")){
            countWashing++;
            int currentDishes = Integer.parseInt(command);

            if (countWashing % 3 ==0){
                int currentWash = currentDishes * 15;
                detergentSpent += currentWash;
                leftoverDetergent = Math.abs(totalDetergent -detergentSpent);
                countPots += currentDishes;
            } else {
                int currentWash = currentDishes * 5;
                detergentSpent += currentWash;
                leftoverDetergent = Math.abs(totalDetergent - detergentSpent);
                countDishware += currentDishes;
            }

            if (detergentSpent > totalDetergent){
                detergentFinished = true;
                break;
            }

            command = scanner.nextLine();
        }



        if (detergentFinished){
            System.out.printf("Not enough detergent, %d ml. more necessary!", leftoverDetergent );
        }

        if (command.equals("End")){
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishware, countPots);
            System.out.printf("Leftover detergent %d ml.", leftoverDetergent);
        }

    }
}
