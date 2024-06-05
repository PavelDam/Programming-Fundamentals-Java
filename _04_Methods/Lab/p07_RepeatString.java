package L04Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.print(repeatString(count, text));
    }

    public static String repeatString(int count, String text) {

        String outputText = "";
        for (int i = 1; i <= count; i++) {
            outputText += text;
        }
        return outputText;
    }
}
