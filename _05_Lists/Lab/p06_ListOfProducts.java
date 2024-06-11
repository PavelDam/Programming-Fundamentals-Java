package L05Lists.Lab;

import java.util.*;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }
        Collections.sort(productList);

        for (int i = 0; i < num; i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
