package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        int diff = 0;

        for (int i = 1; i<= 2*n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (i <= n){
                leftSum = leftSum + num;
            }else {
                rightSum = rightSum + num;
            }

            diff = Math.abs(leftSum - rightSum);

        }

        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
