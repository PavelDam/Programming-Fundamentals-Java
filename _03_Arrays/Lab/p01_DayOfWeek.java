package L03Arrays.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int day = Integer.parseInt(scanner.nextLine());
        if (day >= 1 && day <= 7) {
            System.out.print(dayOfWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
