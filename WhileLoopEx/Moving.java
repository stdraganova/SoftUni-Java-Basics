package WhileLoopEx;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int vApart = w * l * h;

        while (!input.equals("Done")) {
            int numBoxes = Integer.parseInt(input);
            vApart -= numBoxes;

            if (vApart <= 0){
                break;
            }

            input = scanner.nextLine();

        }

        if (vApart <= 0 && !input.equals("Done")){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(vApart));
        } else if (vApart > 0 && input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", Math.abs(vApart));
        }
    }
}
