package NestedLoopsEx;

import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++){

            String str = i + "";
            boolean isValid = true;

            for (int j = 0; j < str.length(); j++){
                int dive = Integer.parseInt(str.charAt(j) + "");

                if (dive <= 0 || num % dive >= 1 || num < dive){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                System.out.print(i + " ");
            }


        }
    }
}
