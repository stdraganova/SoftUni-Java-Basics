package ForLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 1; i <= n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            count = count + num;

        }

        System.out.println(count);

    }
}
