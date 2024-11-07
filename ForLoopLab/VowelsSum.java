package ForLoopLab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < str.length() ; i++){
            char symb = str.charAt(i);

            switch (symb){
                case 'a':
                    count = count + 1;
                    break;

                case 'e':
                    count = count + 2;
                    break;

                case 'i':
                    count = count + 3;
                    break;

                case 'o':
                    count = count + 4;
                    break;

                case 'u':
                    count = count + 5;
                    break;
            }

        }

        System.out.println(count);

    }
}
