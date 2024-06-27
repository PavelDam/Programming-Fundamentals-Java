package L09RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> furnitureList = new ArrayList<>();
        double totalPrice = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<count>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                furnitureList.add(name);
                totalPrice += price * count;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
