package L03Arrays.Bonus;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= rows; line++) {

            int C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
