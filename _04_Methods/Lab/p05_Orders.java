package L04Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int countInput = Integer.parseInt(scanner.nextLine());

        printOrder(productInput, countInput);

    }

    public static void printOrder(String product, int count) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        double totalPerice = price * count;
        System.out.printf("%.2f", totalPerice);
    }
}
