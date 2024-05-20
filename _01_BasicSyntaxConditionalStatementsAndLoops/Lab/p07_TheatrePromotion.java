package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOFDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean isValidData = true;

        switch (typeOFDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                } else {
                    isValidData = false;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                } else {
                    isValidData = false;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                } else {
                    isValidData = false;
                }
                break;
        }
        if (isValidData) {
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
