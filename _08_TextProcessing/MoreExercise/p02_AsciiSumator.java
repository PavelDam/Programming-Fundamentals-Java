package L08TextProcessing.MoreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.next().charAt(0);
        char endChar = scanner.next().charAt(0);
        String inputText = scanner.next();
        int sum = 0;

        for (char symbol : inputText.toCharArray()) {
            if (symbol > startChar && symbol < endChar) {
                sum +=  symbol;
            }
        }
        System.out.println(sum);
    }
}
