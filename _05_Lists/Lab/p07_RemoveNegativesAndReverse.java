package L05Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        inputList.removeIf(e -> e < 0);
        Collections.reverse(inputList);

        if (inputList.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
