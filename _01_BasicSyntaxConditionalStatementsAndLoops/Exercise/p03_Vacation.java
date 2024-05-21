package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;

        switch (groupType) {
            case "Students":
                if ("Friday".equals(dayOfWeek)) {
                    pricePerPerson = 8.45;
                } else if ("Saturday".equals(dayOfWeek)) {
                    pricePerPerson = 9.80;
                } else if ("Sunday".equals(dayOfWeek)) {
                    pricePerPerson = 10.46;
                }
                break;
            case "Business":
                if ("Friday".equals(dayOfWeek)) {
                    pricePerPerson = 10.90;
                } else if ("Saturday".equals(dayOfWeek)) {
                    pricePerPerson = 15.60;
                } else if ("Sunday".equals(dayOfWeek)) {
                    pricePerPerson = 16;
                }
                break;
            case "Regular":
                if ("Friday".equals(dayOfWeek)) {
                    pricePerPerson = 15;
                } else if ("Saturday".equals(dayOfWeek)) {
                    pricePerPerson = 20;
                } else if ("Sunday".equals(dayOfWeek)) {
                    pricePerPerson = 22.50;
                }
                break;
        }
        double totalPrice = pricePerPerson * peopleCount;
        if (groupType.equals("Students") && peopleCount >= 30) {
            totalPrice = totalPrice * 0.85;
        }
        if (groupType.equals("Business") && peopleCount >= 100) {
            totalPrice = totalPrice - (10 * pricePerPerson);
        }
        if (groupType.equals("Regular") && peopleCount >= 10 && peopleCount <= 20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
