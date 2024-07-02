package MidExams.MidExam29_02_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();
        int currentIndex = 0;

        while (!commandInput.equals("Love!")) {
            String[] commandArr = commandInput.split(" ");
            int jumpIndex = Integer.parseInt(commandArr[1]);

            currentIndex += jumpIndex;

            if (currentIndex > numList.size() - 1) {
                currentIndex = 0;
            }
            if (numList.get(currentIndex) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
                commandInput = scanner.nextLine();
                continue;
            }
            int house = numList.get(currentIndex);
            house -= 2;
            numList.set(currentIndex, house);
            if (numList.get(currentIndex) == 0) {
                System.out.printf("Place %d has Valentine's day.%n", currentIndex);
            }


            commandInput = scanner.nextLine();
        }
        int placeCounter = 0;
        for (int i = 0; i <= numList.size() - 1; i++) {
            int currentPlace = numList.get(i);
            if (currentPlace != 0) {
                placeCounter++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        if (placeCounter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", placeCounter);
        }
    }
}
