package L04Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long fact1 = actualFactorial(firstNum);
        long fact2 = actualFactorial(secondNum);

        double result = 1.0 * fact1 / fact2;
        System.out.printf("%.2f", result);
    }

    public static long actualFactorial(int Num) {
        long fact = 1;
        for (int i = 1; i <= Num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
