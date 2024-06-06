package L04Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sumOfInt(firstNum, secondNum);
        int subtract = subtractOfInt(sum, thirdNum);

        System.out.println(subtract);

    }

    public static int sumOfInt(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractOfInt(int sum, int num3) {
        return sum - num3;
    }
}
