package L01BasicSyntaxConditionalStatementsAndLoops.Bonus;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double leftBalance = balance;
        double totalSpent = 0;

        while (!game.equals("Game Time")) {
            double gamePrice = 0;
            if (game.equals("OutFall 4")) {
                gamePrice = 39.99;
            } else if (game.equals("CS: OG")) {
                gamePrice = 15.99;
            } else if (game.equals("Zplinter Zell")) {
                gamePrice = 19.99;
            } else if (game.equals("Honored 2")) {
                gamePrice = 59.99;
            } else if (game.equals("RoverWatch")) {
                gamePrice = 29.99;
            } else if (game.equals("RoverWatch Origins Edition")) {
                gamePrice = 39.99;
            } else {
                System.out.println("Not Found");
                game = scanner.nextLine();
                continue;

            }
            if (gamePrice > leftBalance) {
                System.out.println("Too Expensive");
                game = scanner.nextLine();
                continue;
            }
            System.out.printf("Bought %s%n", game);
            totalSpent += gamePrice;
            leftBalance -= gamePrice;
            if (leftBalance <= 0) {
                System.out.println("Out of money!");
            }
            game = scanner.nextLine();
        }
        if (game.equals("Game Time") && leftBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, leftBalance);
        }
    }
}

