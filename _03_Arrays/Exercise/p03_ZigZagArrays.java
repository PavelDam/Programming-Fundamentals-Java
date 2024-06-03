package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int row = 1; row <= n; row++) {
            String[] numbersArray = scanner.nextLine().split(" ");
            if (row % 2 != 0) {
                firstArray[row - 1] = numbersArray[0];
                secondArray[row - 1] = numbersArray[1];
            } else {
                firstArray[row - 1] = numbersArray[1];
                secondArray[row - 1] = numbersArray[0];
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
