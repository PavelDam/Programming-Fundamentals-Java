package FinalExams.FinalExam04042020second;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";
                        //([:*]{2})[A-Z][a-z]{2,}\\1
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int threshold = 1;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                threshold *= Integer.parseInt(String.valueOf(symbol));
            }
        }
        int emojisCount = 0;
        List<String> emojiList = new LinkedList<>();
        while (matcher.find()) {
            emojisCount++;
            String currentEmoji = matcher.group();
            int emojiCool = 0;
            for (char symbol : currentEmoji.toCharArray()) {
                if (Character.isLetter(symbol)) {

                    emojiCool += symbol;
                }
            }
            if (emojiCool > threshold) {
                emojiList.add(currentEmoji);
            }

        }
        System.out.printf("Cool threshold: %d%n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojisCount);
        emojiList.forEach(System.out::println);
    }
}