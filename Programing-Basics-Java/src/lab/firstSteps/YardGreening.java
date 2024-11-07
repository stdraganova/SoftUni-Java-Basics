package lab.firstSteps;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m2 = Double.parseDouble(scanner.nextLine());
        double sumFinal = (m2 * 7.61) - (m2 * 7.61 * 0.18);
        double discount = m2*7.61 * 0.18;
        System.out.println("The final price is: " + sumFinal + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
