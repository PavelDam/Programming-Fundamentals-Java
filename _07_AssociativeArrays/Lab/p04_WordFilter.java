package L07AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordList = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        System.out.print(String.join(System.lineSeparator(), wordList));
    }
}
