package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int gameCounter = 0;
        int headsetTrash = 0;
        int mouseTrash = 0;
        int keyboardTrash = 0;
        int displayTrash = 0;


        for (int i = 1; i <= lostGamesCount; i++) {
            gameCounter++;
            boolean isValid1 = false;
            boolean isValid2 = false;

            if (gameCounter % 2 == 0) {
                headsetTrash++;
                isValid1 = true;
            }
            if (gameCounter % 3 == 0) {
                mouseTrash++;
                isValid2 = true;
            }
            if (isValid1 && isValid2) {
                keyboardTrash++;
            }
        }
        displayTrash = keyboardTrash / 2;
        double totalMoney = (headsetTrash * headsetPrice) + (mouseTrash * mousePrice) + (keyboardTrash * keyboardPrice) + (displayTrash * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalMoney);
    }
}
