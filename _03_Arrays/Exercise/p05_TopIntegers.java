package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int index = 0; index < numsArray.length; index++) {
            int currentNum = numsArray[index];
            int topInt = 0;
            boolean isTop = true;
            if (index == numsArray.length - 1) {
                topInt = currentNum;
            }
            for (int inIndex = index + 1; inIndex < numsArray.length; inIndex++) {
                int numToChek = numsArray[inIndex];
                if (currentNum > numToChek) {
                    topInt = currentNum;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(topInt + " ");
            }
        }
    }
}
