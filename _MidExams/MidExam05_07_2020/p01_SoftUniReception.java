package MidExams.MidExam05_07_2020;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEficeiency = 0;
        for (int i = 1; i <= 3; i++) {
            int oneEmployeeEf = Integer.parseInt(scanner.nextLine());
            totalEficeiency += oneEmployeeEf;
        }
        int studentCount = Integer.parseInt(scanner.nextLine());

        int hourCount = 0;
        while (studentCount > 0) {
            hourCount++;

            if (hourCount % 4 == 0) {
                continue;
            }
            studentCount -= totalEficeiency;
        }
        System.out.printf("Time needed: %dh.", hourCount);
    }
}
