package L06ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < inputArr.length; i++) {
            int randomNumber = rnd.nextInt(inputArr.length);

            String oldWord = inputArr[i];
            inputArr[i] = inputArr[randomNumber];
            inputArr[randomNumber] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), inputArr));

    }
}
