package L04Methods.Bonus;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        print(a, b, c);
    }

    private static void print(int a, int b, int c) {
        boolean isPositive = false;
        //проверка дали резултата е позитивен
        if (a > 0 && b > 0 && c > 0) {
            isPositive = true;
        }
        //проверка дали резултата е 0
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("zero");
            return;
        }
        //проверка дали резултата е негативен
        int negativeCount = 0;
        for (int i : new int[]{a, b, c}) {
            if (i < 0) {
                negativeCount++;
            }
        }
        if (negativeCount % 2 != 0) {
            System.out.println("negative");
        } else {
            isPositive = true;
        }
        if (isPositive) {
            System.out.println("positive");
        }
    }
}