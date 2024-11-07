package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numGroups = Integer.parseInt(scanner.nextLine());

        int allPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        /*double percentMusala = 0;
        double percentMonblan = 0;
        double percentKilimanjaro = 0;
        double percentK2 = 0;
        double percentEverest = 0;*/


        for (int i = 1; i <= numGroups; i++){
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            allPeople +=peopleInGroup;

            if (peopleInGroup <= 5){
                //Musala
                musala += peopleInGroup;

            } else if (peopleInGroup >= 6 && peopleInGroup <= 12) {
                //Montblan
                monblan += peopleInGroup;

            } else if (peopleInGroup >= 13 && peopleInGroup <=25) {
                //Kilimanjaro
                kilimanjaro += peopleInGroup;

            }else if (peopleInGroup >= 26 && peopleInGroup <= 40){
                //K2
                k2 += peopleInGroup;

            }else {
                //Everest
                everest += peopleInGroup;

            }
        }

        double percentMusala = (musala * 1.0 / allPeople * 1.0) * 100;
        double percentMonblan = (monblan * 1.0 / allPeople * 1.0) * 100;
        double percentKilimanjaro = (kilimanjaro * 1.0/ allPeople * 1.0) * 100;
        double percentK2 = (k2 * 1.0 / allPeople * 1.0) * 100;
        double percentEverest = (everest * 1.0 / allPeople * 1.0) * 100;

        System.out.printf("%.2f%%%n",percentMusala);
        System.out.printf("%.2f%%%n",percentMonblan);
        System.out.printf("%.2f%%%n",percentKilimanjaro);
        System.out.printf("%.2f%%%n",percentK2);
        System.out.printf("%.2f%%%n",percentEverest);

    }
}
