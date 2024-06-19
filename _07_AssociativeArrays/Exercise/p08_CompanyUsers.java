package L07AssociativeArrays.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, ArrayList<String>> usersMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String user = input.split(" -> ")[1];

            if (!usersMap.containsKey(company)) {
                usersMap.put(company, new ArrayList<>());
                usersMap.get(company).add(user);
            }
            if (usersMap.containsKey(company)&&!usersMap.get(company).contains(user)){
                usersMap.get(company).add(user);
            }

            input = scanner.nextLine();
        }
        usersMap.entrySet().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().stream().
                    forEach(e -> System.out.printf("-- %s%n", e));
        });
    }

}

