package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        int third = 0;
        int forth = 0;
        int fifth = 0;
        int invalid = 0;
        double result = 0;

        for (int i = 1; i <= moves; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num >=0 && num <= 9){
                result += num * 0.20;
                first ++;
            } else if (num >= 10 && num <= 19) {
                result += num * 0.30;
                second ++;
            } else if (num >= 20 && num <= 29) {
                result += num * 0.40;
                third ++;
            } else if (num >= 30 && num <= 39) {
                result += 50;
                forth ++;
            } else if (num >= 40 && num <= 50) {
                result += 100;
                fifth ++;
            }else {
                result /= 2;
                invalid++;
            }
        }

        double firstPercent = (first * 1.0 / moves) * 100;
        double secondPercent = (second * 1.0 / moves) * 100;
        double thirdPercent = (third * 1.0 / moves) * 100;
        double forthPercent = (forth * 1.0 / moves) * 100;
        double fifthPercent = (fifth * 1.0 / moves) * 100;
        double invalidPercent = (invalid * 1.0 / moves) * 100;

        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",firstPercent);
        System.out.printf("From 10 to 19: %.2f%%%n",secondPercent);
        System.out.printf("From 20 to 29: %.2f%%%n",thirdPercent);
        System.out.printf("From 30 to 39: %.2f%%%n",forthPercent);
        System.out.printf("From 40 to 50: %.2f%%%n",fifthPercent);
        System.out.printf("Invalid numbers: %.2f%%",invalidPercent);
    }
}
