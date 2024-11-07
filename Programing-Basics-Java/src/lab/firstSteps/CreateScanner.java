package lab.firstSteps;

import java.util.Scanner;

public class CreateScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //създава скенер за инпут от потребител
        String userInput = scanner.nextLine(); // сканира следващия ред
        System.out.println(userInput); // принтира резултата
    }
}
