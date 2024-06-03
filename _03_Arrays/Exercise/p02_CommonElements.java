package L03Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String secondItem : secondArray) {
            for (String firstItem : firstArray) {
                if (secondItem.equals(firstItem)) {
                    System.out.print(secondItem + " ");
                }
            }
        }
    }
}
