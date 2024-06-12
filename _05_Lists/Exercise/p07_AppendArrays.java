package L05Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(numbersList);

        String toPrint = numbersList.toString().replaceAll("[\\]\\[,]", "").trim();
        toPrint = toPrint.replaceAll("\\s+", " ");

        System.out.println(toPrint);
    }
}

