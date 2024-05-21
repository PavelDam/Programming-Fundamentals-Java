package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            System.out.printf("%d ", i);

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
