package MidExams.MidExam1;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int lectureNumber = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 1; i <= studentsNumber; i++) {
            int studentAttendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (1.0 * studentAttendance / lectureNumber * (5 + additionalBonus));

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendance = studentAttendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
