package L04Methods.Bonus;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int a = 0;
        int b = 1;
        int c = 1;
        int d = a + b + c;

        printSequence(num, b, c, d);


    }

    private static void printSequence(int num, int b, int c, int d) {
        int a;
        switch (num) {
            case 1:
                System.out.print(b);
                break;
            case 2:
                System.out.print(b + " ");
                System.out.print(c);
                break;
            default:
                System.out.print(b + " ");
                System.out.print(c + " ");
                for (int i = 3; i <= num; i++) {
                    System.out.print(d + " ");
                    a = b;
                    b = c;
                    c = d;
                    d = a + b + c;
                }
        }
    }
}
