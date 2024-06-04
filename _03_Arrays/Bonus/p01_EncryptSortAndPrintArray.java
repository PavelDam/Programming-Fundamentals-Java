package L03Arrays.Bonus;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringsNum = Integer.parseInt(scanner.nextLine());

        int[] namesArray = new int[stringsNum];


        for (int index = 0; index < stringsNum; index++) {
            String name = scanner.nextLine();
            int charSum = 0;
            int indexArray = 0;
            for (int nameIndex = 0; nameIndex <= name.length() - 1; nameIndex++) {
                char ch = name.charAt(nameIndex);
                int ascii = (int) ch;
                if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                        || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U')) {
                    charSum += ascii * name.length();
                } else {
                    charSum += ascii / name.length();
                }
                if (nameIndex == name.length() - 1) {
                    namesArray[index] = charSum;
                }
            }
        }
        Arrays.sort(namesArray);
        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }
    }
}
