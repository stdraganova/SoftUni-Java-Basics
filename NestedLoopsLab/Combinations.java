package NestedLoopsLab;

import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int count = 0;

        for (int n1 = 0; n1 <= 25; n1++){
            for (int n2 = 0; n2 <= 25; n2++){
                for (int n3 = 0; n3 <= 25; n3++){
                    sum = n1 + n2 + n3;

                    if (sum == n){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
