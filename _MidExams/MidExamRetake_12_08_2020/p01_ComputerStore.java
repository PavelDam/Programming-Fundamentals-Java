package MidExams.MidExamRetake_12_August_2020;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();

        double priceWithoutTax = 0;
        double taxes = 0;
        double totalPrice = 0;
        boolean isSpecial = false;

        while (!commandInput.equals("special") && !commandInput.equals("regular")) {
            double itemPrice = Double.parseDouble(commandInput);

            if (itemPrice < 1) {
                System.out.println("Invalid price!");
                commandInput = scanner.nextLine();
                continue;
            }

            priceWithoutTax += itemPrice;
            taxes += itemPrice * 0.2;
            totalPrice += itemPrice + (itemPrice * 0.2);


            commandInput = scanner.nextLine();
        }
        if (commandInput.equals("special")) {
            totalPrice = totalPrice * 0.9;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTax);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        }

    }
}
