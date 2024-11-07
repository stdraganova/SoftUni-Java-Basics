package exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountDeposited = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine()); //Във формулата делим на 100, за да превърнем от процент в число
        double sum = amountDeposited + term * ((amountDeposited * (interestRate/100))/12);
        System.out.println(sum);
    }
}
