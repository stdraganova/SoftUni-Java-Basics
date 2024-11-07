package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for (int i =1; i < 10000; i++){
            String destination = scanner.nextLine();

            if (destination.equals("End")){
                break;
            }

            double neededMoney = Double.parseDouble(scanner.nextLine());

            while (!destination.equals("End")){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                sum = sum + savedMoney;

                if (sum >= neededMoney){
                    sum = 0;
                    System.out.printf("Going to %s!%n",destination);
                    break;
                }

            }

        }
    }
}
