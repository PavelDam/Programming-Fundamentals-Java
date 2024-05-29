package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int litersInTank = 0;
        for (int i = 1; i <= numberOfLines; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (capacity < liters) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            litersInTank += liters;
            capacity -= liters;

        }
        System.out.println(litersInTank);
    }
}
