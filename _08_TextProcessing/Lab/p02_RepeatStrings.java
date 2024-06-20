package L08TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");

        StringBuilder finalWord = new StringBuilder();

        int inputArrLength = inputArr.length;

        concatMethod(inputArr, finalWord, inputArrLength);

    }

    private static void concatMethod(String[] inputArr, StringBuilder finalWord, int inputArrLength) {
        for (int i = 0; i < inputArrLength; i++) {
            String currentWord = inputArr[i];
            int currentWordLength = currentWord.length();
            for (int j = 0; j < currentWordLength; j++) {
                finalWord.append(currentWord);
            }
        }
        System.out.println(finalWord);
    }
}
