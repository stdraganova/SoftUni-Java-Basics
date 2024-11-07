package NestedLoopsEx;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int currentNum = num1; currentNum <= num2; currentNum++){

            // int -> String
            //String txtCurrentNum = String.valueOf(currentNum);
            //String txtCurrentNum = Integer.toString(currentNum);
            String txtCurrentNum = currentNum + "";

            int odd = 0;
            int even = 0;

            for (int position = 0; position <= txtCurrentNum.length() - 1; position++){

                // char -> string -> int
                int currentDigit = Integer.parseInt(txtCurrentNum.charAt(position) + "");

                if (position % 2 == 0){
                    even += currentDigit;
                }else {
                    odd += currentDigit;
                }
            }

            if (odd == even){
                System.out.print(currentNum + " ");
            }
        }
    }
}
