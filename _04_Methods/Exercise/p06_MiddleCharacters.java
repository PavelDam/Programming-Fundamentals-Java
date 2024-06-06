package L04Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChar(input);
    }

    private static void printMiddleChar(String input) {
        if (input.length() % 2 == 0) {
            char leftSymbol = input.charAt((input.length() / 2) - 1);
            char rightSymbol = input.charAt(input.length() / 2);
            System.out.printf("%c%c", leftSymbol, rightSymbol);
        } else {
            char middleSymbol = input.charAt(input.length() / 2);
            System.out.printf("%c", middleSymbol);
        }
    }
}
