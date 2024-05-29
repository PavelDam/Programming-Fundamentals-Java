package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int workersConsumption = 26;


        int totalYeld = 0;
        int dayCounter = 0;

        while (yield >= 100) {
            int todayYield = yield;
            dayCounter++;
            todayYield -= workersConsumption;
            totalYeld += todayYield;
            yield -= 10;

        }
        System.out.println(dayCounter);
        System.out.println(totalYeld - workersConsumption);
    }
}
