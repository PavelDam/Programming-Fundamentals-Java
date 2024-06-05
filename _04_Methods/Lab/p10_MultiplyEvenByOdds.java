package L04Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = multiplyNumber(number);
        System.out.println(result);
    }

    public static int multiplyNumber(int number) {

        int evenSum = evenSum(number);
        int oddSum = oddSum(number);

        int result = evenSum * oddSum;
        return result;
    }

    public static int evenSum(int number) {
        int evenSum = 0;
        while (Math.abs(number) > 0) {
            int digit = number % 10;
            number = number / 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            }
        }
        return evenSum;
    }

    public static int oddSum(int number) {
        int oddSum = 0;
        while (Math.abs(number) > 0) {
            int digit = number % 10;
            number = number / 10;

            if (digit % 2 != 0) {
                oddSum += digit;
            }
        }
        return oddSum;
    }
}

