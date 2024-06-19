package L07AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(resource)) {
                resourcesMap.put(resource, quantity);
            } else {
                int currentValue = resourcesMap.get(resource);
                resourcesMap.put(resource, currentValue + quantity);
            }

            input = scanner.nextLine();
        }
        resourcesMap.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
