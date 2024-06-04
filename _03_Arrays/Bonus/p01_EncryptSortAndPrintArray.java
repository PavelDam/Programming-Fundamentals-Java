package L03Arrays.Bonus;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class P01EncryptSortAndPrintArray {

    private final static Set<Character> VOWEL_SYMBOLS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputRows = Integer.parseInt(scanner.nextLine());

        int[] namesArray = new int[inputRows];



        for (int index = 0; index < inputRows; index++) {
            String name = scanner.nextLine();
            int charSum = 0;

            for (int nameIndex = 0; nameIndex <= name.length() - 1; nameIndex++) {

                char ch = name.charAt(nameIndex);

                if (VOWEL_SYMBOLS.contains(ch)) {
                    charSum += (int) ch * name.length();
                } else {
                    charSum += (int) ch / name.length();
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
