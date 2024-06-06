package L04Methods.Exercise;

import java.util.Scanner;
import java.util.Set;

public class P02VowelsCount {

    private final static Set<Character> VOWELS = Set.of('a', 'e', 'o', 'u', 'i');

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        int count =  vowelCount(input);

        System.out.println(count);
    }

    private static int vowelCount(String input) {
        int vowelCount = 0;

        for (char item : input.toCharArray()) {
            if (VOWELS.contains(item)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
