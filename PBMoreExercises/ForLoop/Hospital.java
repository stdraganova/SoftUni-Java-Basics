package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int viewd = 0;
        int notViewd = 0;

        for ( int i = 1; i <= days; i++){
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && viewd < notViewd ){
                    doctors++;
            }

            int diff = doctors - patients;

            if (diff >= 0){
                viewd += patients;
            }else {
                viewd += patients - Math.abs(diff);
                notViewd += Math.abs(diff);
            }
        }
        System.out.printf("Treated patients: %d.%n", viewd);
        System.out.printf("Untreated patients: %d.%n", notViewd);
    }
}
