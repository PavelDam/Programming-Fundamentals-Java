package L02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            int digitSum = 0;

            int currentNum = i;
            while (currentNum > 0) {
                digitSum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpaecial = (digitSum == 5) || (digitSum == 7) || (digitSum == 11);

            if (isSpaecial) {
                System.out.printf("%d -> True%n", i);

            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}
