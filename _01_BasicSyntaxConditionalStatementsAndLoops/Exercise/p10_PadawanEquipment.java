package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = 0;
        if (studentsCount >= 6) {
            freeBelts = Math.floorDiv(studentsCount, 6);
        }

        double totalLightsabersPrice = (lightsaberPrice * Math.ceil(studentsCount * 1.10));
        double totalRobePrice = robePrice * studentsCount;
        double totalBeltsPrice = (studentsCount - freeBelts) * beltPrice;
        double totalPrice = totalLightsabersPrice + totalBeltsPrice + totalRobePrice;

        if (budget >= totalBeltsPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (totalPrice - budget));
        }
    }
}
