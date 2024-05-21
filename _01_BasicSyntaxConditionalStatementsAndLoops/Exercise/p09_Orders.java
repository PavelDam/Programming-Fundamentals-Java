package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= count; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double sum = ((days * capsuleCount) * capsulePrice);
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
            totalSum += sum;
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
