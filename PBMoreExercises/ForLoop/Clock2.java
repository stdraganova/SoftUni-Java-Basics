package PBMoreExercises.ForLoop;

import java.util.Scanner;

public class Clock2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 23; i++){
            for (int j = 0; j <= 59; j++){
                for (int a = 0; a <= 59; a++){
                    System.out.println(i+ " : " + j + " : " +a);
                }
            }
        }
    }
}
