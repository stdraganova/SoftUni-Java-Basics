package WhileLoop;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String txt = "";
        while (!txt.equals("Stop")){
            System.out.println(txt);
            txt = scanner.nextLine();

        }
    }
}
