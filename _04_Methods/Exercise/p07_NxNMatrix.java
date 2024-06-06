package L04Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printMatrix(num);
    }

    public static void printMatrix(int num) {

        for (int columns = 1; columns <= num; columns++) {
            for (int rows = 1; rows <= num; rows++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
