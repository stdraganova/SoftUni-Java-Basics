package NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicN = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int count = 0;
        boolean flag = false;

        for (int i = n1; i <= n2; i++){
            for (int j = n1; j <= n2; j++){
                sum = i + j;
                count ++;

                if (sum == magicN){
                    flag = true;
                    if (flag){
                        System.out.printf("Combination N:%d (%d + %d = %d)",count, i, j, sum);
                    }
                    break;
                }
            }

            if (flag){
                break;
            }
        }

        if (flag == false){
                System.out.printf("%d combinations - neither equals %d", count, magicN);
        }

    }
}
