package L03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensedArr = new int[numsArr.length - 1];

        for (int index = 0; index < numsArr.length; index++) {
            if (numsArr.length == 1) {

                break;
            }
            if (index == numsArr.length - 1) {
                int[] condensedNewArr = new int[condensedArr.length - 1];
                index = -1;
                numsArr = condensedArr;
                condensedArr = condensedNewArr;
            } else {
                condensedArr[index] = numsArr[index] + numsArr[index + 1];
            }
        }
        System.out.println(numsArr[0]);
    }
}
