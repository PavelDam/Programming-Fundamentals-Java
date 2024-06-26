package L04Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(greaterValue(firstNum, secondNum));
                break;

            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(greaterValue(firstSymbol, secondSymbol));
                break;

            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(greaterValue(firstText, secondText));
                break;
        }
    }

    public static int greaterValue(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char greaterValue(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }

    public static String greaterValue(String firstText, String secondText) {
        if (firstText.compareTo(secondText) > 0) {
            return firstText;
        } else {
            return secondText;
        }
    }
}
