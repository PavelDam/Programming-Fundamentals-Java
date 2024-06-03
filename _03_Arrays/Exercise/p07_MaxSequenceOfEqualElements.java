package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int index = 1; index <= numsArray.length - 1; index++) {
            int currentNum = numsArray[index];
            int numToCheck = numsArray[index - 1];

            if (currentNum == numToCheck) {
                length++;
            } else {
                length = 1;
                startIndex = index;
            }
            //проверка за дължината на поредицата
            if (length > maxLength) {
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(numsArray[i] + " ");
        }

    }
}
