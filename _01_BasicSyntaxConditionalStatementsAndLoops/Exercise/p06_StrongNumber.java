package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - 48;

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            sum += fact;
        }
        int inputNum = Integer.parseInt(num);
        if (sum == inputNum) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
