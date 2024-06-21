package L08TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder finalString = new StringBuilder();

        for (int i = 1; i < input.length() - 1; i++) {

            char symbol = input.charAt(i);
            char checkSymbol = input.charAt(i + 1);
            if (symbol != checkSymbol) {
                finalString.append(symbol);
            }
            if (i == input.length() - 2) {
                finalString.append(input.charAt(input.length() - 1));
            }
        }

        System.out.println(finalString);
    }
}
