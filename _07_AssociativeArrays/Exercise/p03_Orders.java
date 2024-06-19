package L07AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productsMap = new LinkedHashMap<>();
        Map<String, Integer> rememberProducts = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
            double totalPrice = quantity * price;

            if (!productsMap.containsKey(name)) {
                productsMap.put(name, totalPrice);
                rememberProducts.put(name, quantity);
            } else {
                rememberProducts.put(name, rememberProducts.get(name) + quantity);
                productsMap.put(name, rememberProducts.get(name) * price);
            }
            input = scanner.nextLine();
        }
        productsMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
