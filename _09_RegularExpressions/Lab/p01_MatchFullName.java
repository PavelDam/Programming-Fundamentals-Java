package L09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Валидно име има => характеристики
        //  1.Състои се от две думи
        //  2.Всяка дума започва с главна буква
        //  3.След първата (главна) буква съдържа само малки букви
        //  4.Всяка от думите трябва да е поне с 2 букви дължина
        //  5.Думите са разделени с единичен интервал
        String regex = "\\b[A-Z][a-z]+\\b \\b[A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
