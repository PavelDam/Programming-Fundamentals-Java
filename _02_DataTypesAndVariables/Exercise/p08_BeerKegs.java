package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        double biggest = 0;
        String biggestKeg = "";

        for (int i = 1; i <= numberOfKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;
            if (volume > biggest) {
                biggest = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
