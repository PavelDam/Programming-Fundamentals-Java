package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int indexA = 0; indexA < numbersArray.length; indexA++) {
            int numA = numbersArray[indexA];
            for (int indexB = indexA + 1; indexB < numbersArray.length; indexB++) {
                int numB = numbersArray[indexB];
                if (numA + numB == magicSum) {
                    System.out.println(numA + " " + numB);
                }
            }
        }
    }
}
