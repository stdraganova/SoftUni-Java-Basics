package NestedLoopsLab;

public class Clock {

    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++ ){
            for (int min = 0; min <= 59; min++){
                System.out.println(hour + ":" + min);
            }
        }
    }
}
