package WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stop = scanner.nextLine();
        int num = 0;
        int max = Integer.MIN_VALUE;

        while (!stop.equals("Stop")){
            num = Integer.parseInt(stop);

            if (num >= max){
                max = num;
            }

            stop = scanner.nextLine();
        }

        System.out.println(max);
    }
}
