package L01BasicSyntaxConditionalStatementsAndLoops.Bonus;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbreOfLoops = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numbreOfLoops; i++) {
            String input = scanner.nextLine();

            int numberOfDigits = input.length();
            int mainDigit = Integer.parseInt(input) % 10;

            if (mainDigit == 2) {
                if (numberOfDigits == 1) {
                    System.out.print("a");
                } else if (numberOfDigits == 2) {
                    System.out.print("b");
                } else if (numberOfDigits == 3) {
                    System.out.print("c");
                }
            } else if (mainDigit == 3) {
                if (numberOfDigits == 1) {
                    System.out.print("d");
                } else if (numberOfDigits == 2) {
                    System.out.print("e");
                } else if (numberOfDigits == 3) {
                    System.out.print("f");
                }
            } else if (mainDigit == 4) {
                if (numberOfDigits == 1) {
                    System.out.print("g");
                } else if (numberOfDigits == 2) {
                    System.out.print("h");
                } else if (numberOfDigits == 3) {
                    System.out.print("i");
                }
            } else if (mainDigit == 5) {
                if (numberOfDigits == 1) {
                    System.out.print("j");
                } else if (numberOfDigits == 2) {
                    System.out.print("k");
                } else if (numberOfDigits == 3) {
                    System.out.print("l");
                }
            } else if (mainDigit == 6) {
                if (numberOfDigits == 1) {
                    System.out.print("m");
                } else if (numberOfDigits == 2) {
                    System.out.print("n");
                } else if (numberOfDigits == 3) {
                    System.out.print("o");
                }
            } else if (mainDigit == 7) {
                if (numberOfDigits == 1) {
                    System.out.print("p");
                } else if (numberOfDigits == 2) {
                    System.out.print("q");
                } else if (numberOfDigits == 3) {
                    System.out.print("r");
                } else if (numberOfDigits == 4) {
                    System.out.print("s");
                }
            } else if (mainDigit == 8) {
                if (numberOfDigits == 1) {
                    System.out.print("t");
                } else if (numberOfDigits == 2) {
                    System.out.print("u");
                } else if (numberOfDigits == 3) {
                    System.out.print("v");
                }
            } else if (mainDigit == 9) {
                if (numberOfDigits == 1) {
                    System.out.print("w");
                } else if (numberOfDigits == 2) {
                    System.out.print("x");
                } else if (numberOfDigits == 3) {
                    System.out.print("y");
                } else if (numberOfDigits == 4) {
                    System.out.print("z");
                }
            } else if (mainDigit == 0) {
                System.out.print(" ");
            }
        }


    }
}
