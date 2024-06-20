package L08TextProcessing.Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textToRemove = scanner.nextLine();
        String inputText = scanner.nextLine();


        while (inputText.contains(textToRemove)) {
            inputText = inputText.replace(textToRemove, "");

        }
        System.out.println(inputText);
    }
}
