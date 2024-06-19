package L07AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();


        Map<Character, Integer> textMap = new LinkedHashMap<>();

        for (char symbol : textInput.toCharArray()) {
            if (symbol==' '){
                continue;
            }
            if (!textMap.containsKey(symbol)) {
                textMap.put(symbol, 1);
            } else {
                int charCounter = textMap.get(symbol);
                textMap.put(symbol, charCounter + 1);
            }
        }
        textMap.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }

}

