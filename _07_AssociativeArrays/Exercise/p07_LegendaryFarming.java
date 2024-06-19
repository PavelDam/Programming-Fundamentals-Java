package L07AssociativeArrays.Exercise;

import java.util.*;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> farmMap = new LinkedHashMap<>();
        farmMap.put("shards", 0);
        farmMap.put("fragments", 0);
        farmMap.put("motes", 0);

        Map<String, Integer> junkMap = new LinkedHashMap<>();


        String legendaryItem = "";
        boolean isWin = false;
        while (!isWin) {
            List<String> inputList = List.of(scanner.nextLine().split("\\s+"));

            for (int i = 0; i < inputList.size(); i += 2) {
                int quantity = Integer.parseInt(inputList.get(i));
                String product = inputList.get(i + 1).toLowerCase();

                if (product.equals("shards") || product.equals("fragments") || product.equals("motes")) {

                    int currentQuantity = farmMap.get(product);
                    farmMap.put(product, currentQuantity + quantity);
                    if (farmMap.get(product) >= 250) {
                        int finalQuantity = farmMap.get(product) - 250;
                        farmMap.put(product, finalQuantity);
                        switch (product) {
                            case "fragments":
                                legendaryItem = "Valanyr";
                                break;
                            case "motes":
                                legendaryItem = "Dragonwrath";
                                break;
                            case "shards":
                                legendaryItem = "Shadowmourne";
                        }
                        isWin = true;
                        break;
                    }

                } else {
                    if (!junkMap.containsKey(product)) {
                        junkMap.put(product, quantity);
                    } else {
                        int currentQuant = junkMap.get(product);
                        junkMap.put(product, currentQuant + quantity);
                    }

                }
            }
            if (isWin) {
                break;
            }
        }

        System.out.printf("%s obtained!%n", legendaryItem);
        farmMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
