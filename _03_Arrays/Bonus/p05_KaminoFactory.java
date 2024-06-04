package L03Arrays.Bonus;

import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());

        String dna = scanner.nextLine();

        int bestLength = 1;
        int bestStartIndex = 0;
        int bestSequenceSum = 0;
        int sequenceCounter = 0;
        int bestSequenceIndex = 0;
        int[] bestSequence = new int[dnaLength];

        while (!dna.equals("Clone them!")) {
            int[] dnaArray = Arrays.stream(dna.split("!+")).mapToInt(Integer::parseInt).toArray();

            sequenceCounter++;
            int length = 1;
            int CurrentLength = 1;
            int startIndex = 0;
            int currentSequenceSum = 0;

            for (int index = 0; index < dnaArray.length - 1; index++) {
                int currentNum = dnaArray[index];
                int numToCheck = dnaArray[index + 1];
                if (currentNum == numToCheck) {
                    length++;
                } else {
                    length = 1;
                }
                if (length > CurrentLength) {
                    CurrentLength = length;
                    startIndex = index;
                }
                currentSequenceSum += dnaArray[index];
            }
            currentSequenceSum += dnaArray[dnaLength - 1];

            if (CurrentLength > bestLength) {
                bestLength = CurrentLength;
                bestStartIndex = startIndex;
                bestSequenceSum = currentSequenceSum;
                bestSequenceIndex = sequenceCounter;
                bestSequence = dnaArray;

            } else if (CurrentLength == bestLength) {

                if (startIndex < bestStartIndex) {
                    bestLength = CurrentLength;
                    bestStartIndex = startIndex;
                    bestSequenceSum = currentSequenceSum;
                    bestSequenceIndex = sequenceCounter;
                    bestSequence = dnaArray;
                } else if (startIndex == bestStartIndex) {

                    if (currentSequenceSum > bestSequenceSum) {
                        bestLength = CurrentLength;
                        bestStartIndex = startIndex;
                        bestSequenceSum = currentSequenceSum;
                        bestSequenceIndex = sequenceCounter;
                        bestSequence = dnaArray;
                    }
                }
            }
            dna = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int i = 0; i < bestSequence.length; i++) {
            System.out.print(bestSequence[i] + " ");
        }
    }
}
