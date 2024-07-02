package MidExams.MidExamRetake_07_2020;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int currentEnergy = initialEnergy;
        boolean isDead = false;
        int wins = 0;

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (currentEnergy < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, currentEnergy);
                return;
            }
            wins++;
            currentEnergy -= distance;

            if (wins % 3 == 0) {
                currentEnergy += wins;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", wins, currentEnergy);

    }
}
