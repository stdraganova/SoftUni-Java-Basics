package ForLoopLab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i ++){
            char symbol = str.charAt(i);
            System.out.println(symbol);
        }
    }
}
