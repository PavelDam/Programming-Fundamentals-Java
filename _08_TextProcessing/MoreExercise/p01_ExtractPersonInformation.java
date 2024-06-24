package L08TextProcessing.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        Map<String, String> personInfoMap = new LinkedHashMap<>();

        for (int i = 0; i < rows; i++) {
            String currentRowInfo = scanner.nextLine();

            int startNameIndex = currentRowInfo.indexOf("@");
            int endNameIndex = currentRowInfo.indexOf("|");
            String name = currentRowInfo.substring(startNameIndex + 1, endNameIndex);

            int startAgeIndex = currentRowInfo.indexOf("#");
            int endAgeIndex = currentRowInfo.indexOf("*");
            String age = currentRowInfo.substring(startAgeIndex + 1, endAgeIndex);

            personInfoMap.put(name, age);
        }
        personInfoMap.entrySet().forEach(entry -> System.out.printf("%s is %s years old.%n", entry.getKey(), entry.getValue()));
    }
}
