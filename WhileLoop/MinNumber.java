package WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();

        int num = 0;
        int min = Integer.MAX_VALUE;

        while (!stop.equals("Stop")){
            num = Integer.parseInt(stop);

            if (num < min){
                min = num;
            }

            stop = scanner.nextLine();
        }
        System.out.println(min);
    }
}
