package L08TextProcessing.Lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        while (!inputText.equals("end")) {
            StringBuilder reversedText = new StringBuilder();
            int inputTextLength = inputText.length();

            reversMethod(inputText, reversedText, inputTextLength);


            inputText = scanner.nextLine();
        }
    }

    private static void reversMethod(String inputText, StringBuilder reversedText, int inputTextLength) {
        for (int i = inputTextLength - 1; i >= 0; i--) {
            char symbol = inputText.charAt(i);
            reversedText.append(symbol);
        }
        System.out.println(inputText + " = " + reversedText);
    }
}
