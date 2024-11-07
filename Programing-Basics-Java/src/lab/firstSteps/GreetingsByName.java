package lab.firstSteps;

import java.util.Scanner;

public class GreetingsByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //чете входа от конзолата (каквото е написал потребителя)
        String name = scanner.nextLine(); //Връща резултата от конзолата
        // System.out.println("Hello, " + name + "!"); // конкетиниране - обединява два стринга

        //**********

        /*String firstName = "Ivailo";
        String lastName = "Kotov";
        int age = 21;

        System.out.println(firstName + " " + lastName + " @ " + age); // понеже първият аргумент е стринг затова принтира всичко като стринг
         */

        //***********

        double a = 1.5;
        double b = 2.5;
        String sum = "The sum is " + a + b; // всичко е стринг, защото първият аргумент е стринг и имаме конкетинация
        System.out.println(sum);
        System.out.println(a+b);
    }
}
