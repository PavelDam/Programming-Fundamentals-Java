package L02DataTypesAndVariables.Bonus;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {

            if (input.matches("\\d+") || input.matches("\\-")) {
                System.out.println(input + " is an integer type");

            } else if (input.matches("\\d*[.]\\d+")) {
                System.out.println(input + " is floating point type");

            } else if (input.equals("true") || input.equals("false")) {
                System.out.println(input + " is boolean type");

            } else if (input.length()==1) {
                System.out.println(input + " is character type");

            }else if (input.length()>1) {
                System.out.println(input + " is string type");
            }

            input = scanner.nextLine();
        }
    }
}
