package L07AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        Map<String, Integer> submissionMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputArr = input.split("-");
            String name = inputArr[0];

            if (!inputArr[1].equals("banned")) {
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);

                if (!resultMap.containsKey(name)) {
                    resultMap.put(name, points);
                } else {
                    int currentPoints = resultMap.get(name);
                    if (points > currentPoints) {
                        resultMap.put(name, points);
                    }
                }
                if (!submissionMap.containsKey(language)) {
                    submissionMap.put(language, 1);
                } else {
                    submissionMap.put(language, submissionMap.get(language) + 1);
                }
            } else {
                resultMap.remove(name);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        resultMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));
        System.out.println("Submissions:");
        submissionMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
