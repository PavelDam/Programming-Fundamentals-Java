package L04Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printPalindrome(scanner, input);
    }

    private static void printPalindrome(Scanner scanner, String input) {
        while (!input.equals("END")) {

            String reversedInput = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                reversedInput += symbol;
            }

            if (input.equals(reversedInput)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }
}
