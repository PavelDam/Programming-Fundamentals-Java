package L08TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        String str1 = inputArr[0];
        String str2 = inputArr[1];
        int charMultiplier = sum(str1, str2);
        System.out.println(charMultiplier);

    }

    private static int sum(String str1, String str2) {
        int totalSum = 0;


        if (str1.length() > str2.length()) {
            String sub = str1.substring(str2.length());
            for (int i = 0; i < str2.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }
            for (char symbol : sub.toCharArray()) {
                totalSum += symbol;
            }
        } else if (str1.length() < str2.length()) {
            String sub = str2.substring(str1.length());
            for (int i = 0; i < str1.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }
            for (char symbol : sub.toCharArray()) {
                totalSum += symbol;
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }
        }
        return totalSum;
    }

}
