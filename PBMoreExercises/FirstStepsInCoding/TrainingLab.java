package PBMoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wToCm = w * 100;
        double hToCm = (h * 100) - 100;
        //double s = wToCm * (hToCm - 100);
        double workSpaceW = 120;
        double workSpaceH = 70;
        double numPlacesW = Math.floor(wToCm / workSpaceW);
        double numPlacesH = Math.floor(hToCm / workSpaceH);

        double result = (numPlacesW * numPlacesH) - 3;

        if (h >= 3 && h <= w && w <= 100);
        System.out.printf("%.0f",result);
    }

}
