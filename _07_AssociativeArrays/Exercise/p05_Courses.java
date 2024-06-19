package L07AssociativeArrays.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, ArrayList<String>> courseMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseMap.containsKey(courseName)) {
                courseMap.put(courseName, new ArrayList<>());
                courseMap.get(courseName).add(studentName);
            } else {
                courseMap.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }
        courseMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().
                    forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
