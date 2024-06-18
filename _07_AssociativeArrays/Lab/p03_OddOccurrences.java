package L07AssociativeArrays.Lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String element : inputArr) {
            element = element.toLowerCase();

            map.putIfAbsent(element, 0);
            map.put(element, map.get(element) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ", resultList));

    }
}
