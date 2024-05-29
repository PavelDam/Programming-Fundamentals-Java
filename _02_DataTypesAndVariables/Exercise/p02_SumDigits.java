package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int currentNum = num;
        while (currentNum > 0) {

            sum += currentNum % 10;
            currentNum = currentNum / 10;
        }
        System.out.println(sum);
    }
}
