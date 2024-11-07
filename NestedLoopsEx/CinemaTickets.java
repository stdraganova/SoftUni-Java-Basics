package NestedLoopsEx;

import java.util.Scanner;

public class CinemaTickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int freePlaces;

        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        int allStudentCount = 0;
        int allStandardCount = 0;
        int allKidsCount = 0;

        boolean isFull = false;

        while (!movie.equals("Finish")){

            freePlaces = Integer.parseInt(scanner.nextLine());

            double percentFull = 0;
            for (int ticket = 1; ticket <= freePlaces; ticket++ ){
                String type = scanner.nextLine();

                switch (type){
                    case "student":
                        studentCount++;
                        allStudentCount++;
                        break;

                    case "standard":
                        standardCount++;
                        allStandardCount++;
                        break;

                    case "kid":
                        kidsCount++;
                        allKidsCount++;
                        break;
                }
                percentFull = ((kidsCount + studentCount + standardCount) * 1.0 / freePlaces) * 100;
                if (ticket == freePlaces || type.equals("End")){
                    isFull = true;
                    kidsCount = 0;
                    studentCount = 0;
                    standardCount = 0;
                    break;
                }

            }

            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);

            if (!isFull){
                break;
            }

            movie = scanner.nextLine();
        }

        int totalTickets = allKidsCount + allStandardCount + allStudentCount;
        double percentStudent = (allStudentCount * 1.0 / totalTickets) * 100;
        double percentStandard = (allStandardCount * 1.0 / totalTickets) * 100;
        double percentKid = (allKidsCount * 1.0 / totalTickets) * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentKid);

    }
}
