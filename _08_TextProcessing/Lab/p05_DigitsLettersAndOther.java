package L08TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder digitBuilder = new StringBuilder();
        StringBuilder letterBuilder = new StringBuilder();
        StringBuilder symbolBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)) {
                digitBuilder.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterBuilder.append(symbol);
            } else {
                symbolBuilder.append(symbol);
            }
        }
        System.out.println(digitBuilder);
        System.out.println(letterBuilder);
        System.out.println(symbolBuilder);
    }
}
