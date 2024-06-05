package L04Methods.Lab;

import java.util.Scanner;

public class P01SingOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());
        signMethod(numInput);

    }

    public static void signMethod(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }

}
