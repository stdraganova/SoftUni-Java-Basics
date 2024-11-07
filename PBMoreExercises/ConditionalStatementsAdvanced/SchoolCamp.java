package PBMoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        double numStudents = Double.parseDouble(scanner.nextLine());
        double numNights = Double.parseDouble(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season){
            case "Winter":
                if (groupType.equals("boys")){
                    price += 9.60 * numNights * numStudents;
                    sport = "Judo";
                }else if (groupType.equals("girls")){
                    price += 9.60 * numNights * numStudents;
                    sport = "Gymnastics";
                } else if (groupType.equals("mixed")) {
                    price += 10 * numNights * numStudents;
                    sport = "Ski";
                }
                break;

            case "Spring":
                if (groupType.equals("boys")){
                    price += 7.20 * numNights * numStudents;
                    sport = "Tennis";
                }else if (groupType.equals("girls")){
                    price += 7.20 * numNights * numStudents;
                    sport = "Athletics";
                } else if (groupType.equals("mixed")) {
                    price += 9.50 * numNights * numStudents;
                    sport = "Cycling";
                }
                break;

            case "Summer":
                if (groupType.equals("boys")){
                    price += 15 * numNights * numStudents;
                    sport = "Football";
                }else if (groupType.equals("girls")){
                    price += 15 * numNights * numStudents;
                    sport = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    price += 20 * numNights * numStudents;
                    sport = "Swimming";
                }
                break;
        }

        if (numStudents >= 10 && numStudents < 20){
            price -= price * 0.05;
        } else if (numStudents >= 20 && numStudents < 50) {
            price -= price * 0.15;
        } else if (numStudents >= 50){
            price -= price * 0.50;
        }

        System.out.printf("%s %.2f lv.", sport, price);

    }
}
