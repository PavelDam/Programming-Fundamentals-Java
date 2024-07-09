package MidExams.MidExamRetake_12_August_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int maxPerWagon = 4;
        for (int wagon = 0; wagon <= wagonsList.size() - 1; wagon++) {
            int freeSeats = 0;
            int currentWagon = wagonsList.get(wagon);

            if (currentWagon < 4) {
                freeSeats = maxPerWagon - currentWagon;
                if (peopleCount - freeSeats <= 0) {
                    currentWagon += peopleCount;
                    wagonsList.set(wagon, currentWagon);
                    peopleCount = 0;
                    continue;
                }
                peopleCount -= freeSeats;
                currentWagon += freeSeats;
                wagonsList.set(wagon, currentWagon);
            }
        }
        if (peopleCount == 0) {
            boolean isFull = false;
            for (int i = 0; i <= wagonsList.size() - 1; i++) {
                int currentWagon = wagonsList.get(i);
                if (currentWagon == 4) {
                    isFull = true;
                } else {
                    isFull = false;
                }
            }
            if (isFull) {
                for (int i = 0; i <= wagonsList.size() - 1; i++) {
                    System.out.print(wagonsList.get(i) + " ");
                }
            } else {
                System.out.println("The lift has empty spots!");
                for (int i = 0; i <= wagonsList.size() - 1; i++) {
                    System.out.print(wagonsList.get(i) + " ");
                }
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleCount);
            for (int i = 0; i <= wagonsList.size() - 1; i++) {
                System.out.print(wagonsList.get(i) + " ");
            }
        }
    }
}
