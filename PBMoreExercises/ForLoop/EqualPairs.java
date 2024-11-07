package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int firstsum = 0;
        int secondsum = 0;
        int diff = 0;

        for (int i = 1; i <= n; i++){

            if(i == 1){
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());

                firstsum = num1 + num2;
                continue;
            }else {
                int second1 = Integer.parseInt(scanner.nextLine());
                int second2 = Integer.parseInt(scanner.nextLine());

                secondsum = second1 + second2;
            }

            if (Math.abs(firstsum - secondsum) > diff){
                diff = Math.abs(firstsum - secondsum);
            }
            firstsum = secondsum;
        }

        if (diff > 0){
            System.out.printf("No, maxdiff=%d",diff);
        }else{
            System.out.printf("Yes, value=%d",firstsum);
        }

    }
}
