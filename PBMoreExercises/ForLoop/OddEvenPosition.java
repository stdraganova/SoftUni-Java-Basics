package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;

        double evenSum = 0;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;


        for (int i = 1; i <= n ; i++){
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0){
                evenSum += num;
                if (num >evenMax){
                    evenMax = num;
                }
                if (num < evenMin){
                    evenMin = num;
                }
            }else {
                oddSum += num;
                if (num > oddMax){
                    oddMax = num;
                }
                if (num < oddMin){
                    oddMin = num;
                }
            }


        }

        if (n == 0){
            System.out.printf("OddSum=%.2f,%n",oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n",evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");


        }
        else if (n==1){
            System.out.printf("OddSum=%.2f,%n",oddSum);
            System.out.printf("OddMin=%.2f,%n",oddMin);
            System.out.printf("OddMax=%.2f,%n",oddMax);
            System.out.printf("EvenSum=%.2f,%n",evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");


        } else {
            System.out.printf("OddSum=%.2f,%n",oddSum);
            System.out.printf("OddMin=%.2f,%n",oddMin);
            System.out.printf("OddMax=%.2f,%n",oddMax);
            System.out.printf("EvenSum=%.2f,%n",evenSum);
            System.out.printf("EvenMin=%.2f,%n",evenMin);
            System.out.printf("EvenMax=%.2f%n",evenMax);
        }

    }
}
