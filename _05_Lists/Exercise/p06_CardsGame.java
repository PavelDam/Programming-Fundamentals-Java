package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        int end = 0;
        while (end < firstPlayerList.size() && end < secondPlayerList.size()) {


            int firstPlayerCard = firstPlayerList.get(0);
            int secondPlayerCard = secondPlayerList.get(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerList.add(firstPlayerCard);
                firstPlayerList.add(secondPlayerCard);
                firstPlayerList.remove(0);
                secondPlayerList.remove(0);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerList.add(secondPlayerCard);
                secondPlayerList.add(firstPlayerCard);
                firstPlayerList.remove(0);
                secondPlayerList.remove(0);
            } else {
                firstPlayerList.remove(0);
                secondPlayerList.remove(0);
            }

        }
        if (secondPlayerList.size() == 0) {
            int sum = firstPlayerList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = secondPlayerList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
