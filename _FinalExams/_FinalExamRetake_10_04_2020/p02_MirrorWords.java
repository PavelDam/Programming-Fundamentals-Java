package FinalExams.FinalExamRetake10042020;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
                        //([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<WordTwo>[A-Za-z]{3,})\\1
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> wordsList = new LinkedList<>();

        int pairs = 0;
        while (matcher.find()) {
            pairs++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder reverseWordBuilder = new StringBuilder(wordTwo);
            String reversedWord = reverseWordBuilder.reverse().toString();
            if (wordOne.equals(reversedWord)) {
                wordsList.add(String.format("%s <=> %s", wordOne, wordTwo));
            }
        }
        if (pairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", pairs);
        }

        if (wordsList.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", wordsList));
        }
    }
}

