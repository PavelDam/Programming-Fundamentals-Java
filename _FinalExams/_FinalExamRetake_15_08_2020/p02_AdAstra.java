package FinalExams.FinalExamRetake15082020;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(?<delimiter>[#|])(?<product>[A-Z][a-z]+ *[A-Za-z]*)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        List<String> items = new LinkedList<>();

        while (matcher.find()) {
            String product = matcher.group("product");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;

            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", product, date, calories));


        }
        double totalDays = Math.floor(1.0 * totalCalories / 2000);
        System.out.printf("You have food to last you for: %.0f days!%n", totalDays);

        items.forEach(System.out::print);

    }
}

