package L08TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();

        for (String banWord : bannedWordsArr) {
            if (inputText.contains(banWord)) {
                String replace = repeatStr("*", banWord.length());
                inputText = inputText.replace(banWord, replace);
            }
        }
        System.out.println(inputText);
    }

    private static String repeatStr(String str, int length) {
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i < length; i++) {
            replacement.append(str);
        }
        return replacement.toString();
    }
}
