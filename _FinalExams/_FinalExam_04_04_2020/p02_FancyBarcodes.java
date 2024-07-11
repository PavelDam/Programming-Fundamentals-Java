package FinalExams.FinalExam04042020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "@(#+)([A-Z][A-Za-z0-9]{4,}[A-Z])@(#+)";
        Pattern pattern = Pattern.compile(regex);

        int i = 0;
        while (i < count) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String product = matcher.group();
                StringBuilder groupBuilder = new StringBuilder();
                for (char symbol : product.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        groupBuilder.append(symbol);
                    }
                }
                if (groupBuilder.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", groupBuilder.toString());
                }
            }else {
                System.out.println("Invalid barcode");
            }
            i++;
        }
    }
}
