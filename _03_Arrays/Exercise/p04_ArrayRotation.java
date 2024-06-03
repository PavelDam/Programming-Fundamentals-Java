package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineArray = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= rotation; rotations++) {
            String rotateNum = lineArray[0];
            for (int i = 0; i < lineArray.length; i++) {
                if (i != lineArray.length - 1) {
                    lineArray[i] = lineArray[i + 1];
                } else {
                    lineArray[lineArray.length - 1] = rotateNum;
                }
            }
        }
        System.out.println(String.join(" ", lineArray));
    }
}
