package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade > 2.99){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
