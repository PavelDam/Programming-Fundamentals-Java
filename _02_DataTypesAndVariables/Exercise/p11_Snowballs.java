package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowballs = Integer.parseInt(scanner.nextLine());

        double snowballPrice = 0;
        int snowballSnowBest = 0;
        int snowballTimeBest = 0;
        int snowballQualityBest = 0;

        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQality = Integer.parseInt(scanner.nextLine());


            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQality);
            if (snowballValue > snowballPrice) {
                snowballPrice = snowballValue;
                snowballSnowBest = snowballSnow;
                snowballTimeBest = snowballTime;
                snowballQualityBest = snowballQality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBest, snowballTimeBest, snowballPrice, snowballQualityBest);
    }
}
