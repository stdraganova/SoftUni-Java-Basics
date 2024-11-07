package lab.firstSteps;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 7;
        int sum = a * b;
        System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in); // създава скенер
        int a = Integer.parseInt(scanner.nextLine()); // parseInt конвентира първия си аргумент към String и връща int
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.println(area);
        /* ИЛИ
        Scanner scanner = new Scanner (System.in);
        String userInput = scanner.nextLine();
        double userInputAsDouble = Double.parseDouble(userInput);
        double result = userInputAsDouble * 2.54;
        System.out.println(result);
         */
    }
}
