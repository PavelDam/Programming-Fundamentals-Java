package L04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = mathPower(number, power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.print(df.format(result));

    }

    public static double mathPower(double number, double power) {
        double result = Math.pow(number, power);
        return result;
    }
}
