package L04Methods.Bonus;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int intNum = Integer.parseInt(scanner.nextLine());
                printInteger(intNum);
                break;
            case "real":
                double doubleNum = Double.parseDouble(scanner.nextLine());
                printDouble(doubleNum);
                break;
            case "string":
                String text = scanner.nextLine();
                printText(text);
                break;
        }
    }

    public static void printInteger(int num) {
        int sum = num * 2;
        System.out.println(sum);
    }

    public static void printDouble(double num) {
        double sum = num * 1.5;
        System.out.printf("%.2f", sum);
    }

    public static void printText(String text) {
        System.out.println("$" + text + "$");
    }


}
