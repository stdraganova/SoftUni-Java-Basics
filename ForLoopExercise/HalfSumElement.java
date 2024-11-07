package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;

            if (num > max){
                max = num;
            }

        }

        int sumWithoutMax = sum - max;
        int diff = Math.abs(sumWithoutMax - max);

        if (sumWithoutMax == max){
            System.out.printf("Yes%nSum = %d",sumWithoutMax);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }

    }
}
