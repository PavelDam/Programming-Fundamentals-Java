package MidExams.MidExam1Retake;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;

        for (int day = 1; day <= daysOfPlunder; day++) {

            totalPlunder += dailyPlunder;

            if (day % 3 == 0) {
                totalPlunder += 1.0 * dailyPlunder / 2;
            }
            if (day % 5 == 0) {
                totalPlunder = totalPlunder * 0.7;
            }
        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentage = totalPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
