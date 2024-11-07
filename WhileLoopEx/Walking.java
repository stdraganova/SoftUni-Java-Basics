package WhileLoopEx;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        int steps = 0;

        while (!input.equals("Going home")){

            steps = Integer.parseInt(input);
            sum += steps;

            if (sum >= 10000){
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            sum += stepsToHome;
        }

        int diff = Math.abs(10000 - sum);

        if (sum >= 10000){
            System.out.printf("Goal reached! Good job! %n%d steps over the goal!", diff);
        }else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
