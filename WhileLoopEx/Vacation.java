package WhileLoopEx;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        String action = "";
        double amount = 0;
        int days = 0;
        int spendDays = 0;

        while (availableMoney < vacationMoney && spendDays < 5){
            action = scanner.nextLine();
            amount = Double.parseDouble(scanner.nextLine());

            if (action.equals("save")){
                availableMoney += amount;
                spendDays = 0;
            } else if (action.equals("spend")) {
                availableMoney -= amount;
                spendDays++;
                if (availableMoney < 0){
                    availableMoney = 0;
                }
            }

            days++;

        }

        if (spendDays == 5){
            System.out.printf("You can't save the money.%n%d",days);
        }else {
            System.out.printf("You saved the money for %d days.", days);
        }

    }
}
