package PBMoreExercises.ConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double watterP1 = p1 * h;
        double watterP2 = p2 * h;
        double total = watterP1 + watterP2;
        double p1Percent = (watterP1 * 100) /total;
        double p2Percent = (watterP2 * 100) /total;
        double poolPercent = (total * 100) / v;
        double over = Math.abs(v - total);

        if (v >= total){
            //System.out.printf("The pool is %.2f" + "% full. Pipe 1: %.2f" + "%. Pipe 2: %.2f" + "%.", poolPercent, p1Percent, p2Percent);
            System.out.print("The pool is ");
            System.out.printf("%.2f",poolPercent);
            System.out.print("% full. Pipe 1: ");
            System.out.printf("%.2f",p1Percent);
            System.out.print("%. Pipe 2: ");
            System.out.printf("%.2f",p2Percent);
            System.out.print("%.");

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h, over);
        }
    }
}
