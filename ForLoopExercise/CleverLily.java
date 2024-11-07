package ForLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double moneyCount = 0;
        double initialMoney = 10;
        int toysNum = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                moneyCount += initialMoney;
                initialMoney += 10;
            }else{
                toysNum++;
            }
        }

        double toysMoney = toysNum * toyPrice ;
        double totalMoney = toysMoney + (moneyCount - (age/2));
        double diff = Math.abs(totalMoney - washingMachinePrice);

        if (totalMoney >= washingMachinePrice){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }


    }
}
