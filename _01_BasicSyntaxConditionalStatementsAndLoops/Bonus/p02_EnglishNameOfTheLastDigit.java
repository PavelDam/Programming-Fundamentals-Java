package L01BasicSyntaxConditionalStatementsAndLoops.Bonus;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int lasDigit = num % 10;

        if (lasDigit == 1) {
            System.out.println("one");
        } else if (lasDigit == 2) {
            System.out.println("two");
        } else if (lasDigit == 3) {
            System.out.println("three");
        } else if (lasDigit == 4) {
            System.out.println("four");
        } else if (lasDigit == 5) {
            System.out.println("five");
        } else if (lasDigit == 6) {
            System.out.println("six");
        } else if (lasDigit == 7) {
            System.out.println("seven");
        } else if (lasDigit == 8) {
            System.out.println("eight");
        } else if (lasDigit == 9) {
            System.out.println("nine");
        } else if (lasDigit == 0) {
            System.out.println("zero");
        }


    }
}
