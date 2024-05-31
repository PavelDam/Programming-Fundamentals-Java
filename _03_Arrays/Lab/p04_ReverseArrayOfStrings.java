package L03Arrays.Lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int index = 0; index < inputArr.length / 2; index++) {
            String oldElement = inputArr[index];
            inputArr[index] = inputArr[inputArr.length - 1 - index];
            inputArr[inputArr.length - 1 - index] = oldElement;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
