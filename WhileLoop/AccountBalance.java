package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();;
        double total = 0;

        while (!txt.equals("NoMoreMoney")) {
            double num = Double.parseDouble(txt);
            if (num >= 0){
              total += num;
                System.out.printf("Increase: %.2f%n", num);
            }else {
                System.out.println("Invalid operation!");
                break;
            }
            txt = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",total);
    }
}
