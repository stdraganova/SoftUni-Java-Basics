package NestedLoopsEx;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumPrim = 0; // Сум. прости числа
        int sumNonPrim = 0; // Сум. сложни числа

        // Лаил цикъл до получаване на команда стоп
        while (!input.equals("stop")){
            int num = Integer.parseInt(input);

            // Проверяваме дали числото е отрицателно.
            if (num < 0){
                System.out.println("Number is negative.");
            }
            // Проверяваме дали числото е просто или сложно.
            else {
                boolean isPrime = true;

                // Прости числа: делят се на едно и себе си без остатък.
                // Непрости числа: 2 до (числото - 1)

                for (int i = 2; i <= num -1; i++){

                    if (num % i == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime){
                    sumPrim += num;
                }else {
                    sumNonPrim += num;
                }

            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrim);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrim);
    }
}
