package L05Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double num1 = numbersList.get(i);
            double num2 = numbersList.get(i + 1);

            if (num1 == num2) {
                double sum = num1 + num2;
                numbersList.set(i, sum);
                numbersList.remove(i + 1);
                i = -1;
            }
        }

        System.out.print(joinElementsByDelimiter(numbersList, " "));

    }

    public static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {

            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }
}
