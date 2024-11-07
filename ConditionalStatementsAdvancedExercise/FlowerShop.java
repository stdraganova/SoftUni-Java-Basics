package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine()); //magnolii
        int hyacinths = Integer.parseInt(scanner.nextLine()); //zumbuli
        int roses = Integer.parseInt(scanner.nextLine()); //rozi
        int cacti = Integer.parseInt(scanner.nextLine()); //kaktus
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double magnoliasPrice = 3.25 * magnolias;
        double hyacinthsPrice = 4 * hyacinths;
        double rosesPrice = 3.50 * roses;
        double cactiPrise = 8 * cacti;
        double totalPrice = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrise;
        double moneyLeft = totalPrice * 0.95;

        double diff = Math.abs(presentPrice - moneyLeft);

        if (presentPrice <= moneyLeft){
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        }else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }


    }
}
