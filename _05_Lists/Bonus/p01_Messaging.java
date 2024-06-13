package L05Lists.Bonus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> messageList = new java.util.ArrayList<>(List.of(scanner.nextLine().split("")));


        for (int i = 0; i <= numbersList.size() - 1; i++) {

            int sumOfDigits = 0;
            int num = numbersList.get(i);

            while (num > 0) {
                int digit = num % 10;
                sumOfDigits += digit;
                num /= 10;
            }

            String letter = "";

            if (sumOfDigits > messageList.size()) {
                sumOfDigits -= messageList.size();
            }

            letter += messageList.get(sumOfDigits);

            messageList.remove(sumOfDigits);

            System.out.print(letter);
        }

    }
}
