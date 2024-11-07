package PBMoreExercises.WhileLoop;

import java.util.Scanner;

public class StreamOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String command = "";
        String word = "";
        int countC = 0;
        int countO = 0;
        int countN = 0;

        while (!input.equals("End")) {

            char symbol = input.charAt(0);

            if (countC >= 1 && symbol == 'c' || symbol == 'C') {
                word += symbol;
            }else if (countC < 1 && symbol == 'c' || symbol == 'C') {
                countC++;
            }else if (countO >= 1 && symbol == 'o' || symbol == 'O'){
                word += symbol;
            }else if (countO < 1 && symbol == 'o' || symbol == 'O'){
                countO++;
            }else if (countN >= 1 && symbol == 'n' || symbol == 'N'){
                word += symbol;
            } else if (countN < 1 && symbol == 'n' || symbol == 'N'){
                countN++;
            }

            if (countC >= 1 && countN >= 1 && countO >= 1) {
                command += word;
                command += " ";
                word = "";
                countC = 0;
                countO = 0;
                countN = 0;
            }

            switch (symbol) {
                case 'A':
                case 'a':
                case 'B':
                case 'b':
                case 'D':
                case 'd':
                case 'E':
                case 'e':
                case 'F':
                case 'f':
                case 'G':
                case 'g':
                case 'H':
                case 'h':
                case 'I':
                case 'i':
                case 'J':
                case 'j':
                case 'K':
                case 'k':
                case 'L':
                case 'l':
                case 'M':
                case 'm':
                case 'P':
                case 'p':
                case 'Q':
                case 'q':
                case 'R':
                case 'r':
                case 'S':
                case 's':
                case 'T':
                case 't':
                case 'U':
                case 'u':
                case 'V':
                case 'v':
                case 'W':
                case 'w':
                case 'X':
                case 'x':
                case 'Y':
                case 'y':
                case 'Z':
                case 'z':
                    word +=symbol;
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(command);
    }

  }

