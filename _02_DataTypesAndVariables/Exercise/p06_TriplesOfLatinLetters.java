package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 'a' + num; i++) {
            for (int j = 97; j < 'a' + num; j++) {
                for (int k = 97; k < 'a' + num; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
