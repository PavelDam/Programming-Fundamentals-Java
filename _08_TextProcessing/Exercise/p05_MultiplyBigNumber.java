package L08TextProcessing.Exercise;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firsNum = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (secondNum == 0 ) {
            System.out.println(0);
            return;
        }

        StringBuilder sum = getStringBuilder(firsNum, secondNum);

        System.out.println(sum.reverse());
    }

    private static StringBuilder getStringBuilder(String firsNum, int secondNum) {
        StringBuilder sum = new StringBuilder();

        int remainder = 0;

        for (int i = firsNum.length() - 1; i >= 0; i--) {
            int currentDigit = firsNum.charAt(i) - 48;
            int currentSum = currentDigit * secondNum + remainder;

                sum.append(currentSum % 10);
                remainder = currentSum / 10;
        }
        if (remainder > 0) {
            sum.append(remainder);
        }
        return sum;
    }
}
