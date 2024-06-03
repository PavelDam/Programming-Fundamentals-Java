package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int myIndex = 0; myIndex <= numsArray.length - 1; myIndex++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < myIndex; leftIndex++) {
                int leftNum = numsArray[leftIndex];
                leftSum += leftNum;
            }
            for (int rightIndex = myIndex + 1; rightIndex < numsArray.length; rightIndex++) {
                int rightNum = numsArray[rightIndex];
                rightSum += rightNum;
            }
            if (leftSum == rightSum) {
                System.out.print(myIndex);
                return;
            }
        }
        System.out.println("no");
    }
}
