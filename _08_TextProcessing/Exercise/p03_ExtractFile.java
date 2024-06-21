package L08TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\\\");
        String[] fileNameArr = inputArr[inputArr.length - 1].split("\\.");

        System.out.println("File name: " + fileNameArr[0]);
        System.out.println("File extension: " + fileNameArr[1]);
    }
}
