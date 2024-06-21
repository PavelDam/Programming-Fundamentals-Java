package L08TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");


        for (String username : inputArr) {

            if (isValidUser(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUser(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }


}
