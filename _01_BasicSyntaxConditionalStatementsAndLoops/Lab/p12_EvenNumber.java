package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (num % 2 != 0) {
                System.out.println("Please write an even number.");
            }
            if (num % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }
            num = Integer.parseInt(scanner.nextLine());
        }
    }
}
