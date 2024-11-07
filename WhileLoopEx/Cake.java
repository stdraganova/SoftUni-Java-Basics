package WhileLoopEx;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeW = Integer.parseInt(scanner.nextLine());
        int cakeH = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cakeS = cakeW * cakeH;

        while (!input.equals("STOP")){
            int peace = Integer.parseInt(input);
            cakeS = cakeS - peace;

            if (cakeS <= 0){
                break;
            }

            input = scanner.nextLine();
        }

        int diff = Math.abs(cakeS);
        if (input.equals("STOP")){
            System.out.printf("%d pieces are left.", diff);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.", diff);
        }
    }
}
