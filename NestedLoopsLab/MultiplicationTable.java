package NestedLoopsLab;

public class MultiplicationTable {
    public static void main(String[] args) {

        int result = 0;

        for (int n1 = 1; n1 <= 10; n1++){
            for (int n2 = 1; n2 <= 10; n2++){
                result = n1 * n2;
                System.out.printf("%d * %d = %d%n", n1, n2, result);
            }
        }
    }
}
