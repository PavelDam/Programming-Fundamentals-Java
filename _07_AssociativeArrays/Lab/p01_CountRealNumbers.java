package L07AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитаме входни данни
        double[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        //създаваме MAP
        TreeMap<Double, Integer> numbersMap = new TreeMap<>();
        //итерираме по масива за да намерим уникални стойности (key)
        for (double num : numArr) {
            //проверяваме дали числото от масива се съдържа в мапа, ако не добавяме
            if (!numbersMap.containsKey(num)) {
                numbersMap.put(num, 1);
            }
            //ако се съдържа увеличаваме стойността (value) с 1
            else {
                int keyValue = numbersMap.get(num);
                numbersMap.put(num, keyValue + 1);
            }
        }
        for (Map.Entry<Double, Integer> num : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", num.getKey(), num.getValue());
        }

    }
}
