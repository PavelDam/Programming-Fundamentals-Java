package L04Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //за да е валидна паролата:
        //между 6-10 символа (вкл)
        //съдържа само цифри и букви
        //поне 2 цифри
        String input = scanner.nextLine();

        validPassowrd(input);

    }

    public static void validPassowrd(String input) {

        boolean isEnoughLength = false;
        boolean isDigitsAndLetters = false;
        boolean twoDigits = false;

        if (input.length() >= 6 && input.length() <= 10) {
            isEnoughLength = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (input.matches("[a-zA-Z0-9]*")) {
            isDigitsAndLetters = true;
        } else {
            System.out.println("Password must consist only of letters and digits");
        }

        int charCounter = 0;

        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                charCounter++;
            }
        }

        if (charCounter >= 2) {
            twoDigits = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }

        if (isEnoughLength && isDigitsAndLetters && twoDigits) {
            System.out.println("Password is valid");
        }
    }
}
