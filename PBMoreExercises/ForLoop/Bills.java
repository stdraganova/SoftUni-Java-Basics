package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double water = 20 * months;
        double net = 15 * months;
        double allEl = 0;
        for (int i = 1; i <= months; i++){
            double electricity = Double.parseDouble(scanner.nextLine());
            allEl += electricity;
        }

        double all = water + net + allEl;
        double others = all + (all * 0.20);
        double average = (all + others) / months;

        System.out.printf("Electricity: %.2f lv%n",allEl);
        System.out.printf("Water: %.2f lv%n",water);
        System.out.printf("Internet: %.2f lv%n",net);
        System.out.printf("Other: %.2f lv%n",others);
        System.out.printf("Average: %.2f lv",average);
    }
}
