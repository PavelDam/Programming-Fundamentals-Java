package MidExams.MidExam29_02_2020;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodG = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayG = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverG = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeightG = Double.parseDouble(scanner.nextLine()) * 1000;


        for (int days = 1; days <= 30; days++) {

            foodG -= 300;
            if (days % 2 == 0) {
                hayG -= foodG * 0.05;
            }
            if (days % 3 == 0) {
                coverG -= 1.0 * pigWeightG * 1.0 / 3.0;
            }
        }
        if (foodG <= 0 || hayG <= 0 || coverG <= 0) {
            System.out.print("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodG / 1000, hayG / 1000, coverG / 1000);
        }

    }
}
