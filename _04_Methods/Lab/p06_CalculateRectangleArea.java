package L04Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(rectangleArea(scanner));

    }

    public static int rectangleArea(Scanner scanner) {
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        return width * length;
    }
}
