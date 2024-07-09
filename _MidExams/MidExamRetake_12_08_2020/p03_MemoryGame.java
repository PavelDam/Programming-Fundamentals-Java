package MidExams.MidExamRetake_12_August_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String commandInput = scanner.nextLine();
        boolean isEmpty = false;
        int moves = 0;
        while (!commandInput.equals("end")) {
            int index1 = Integer.parseInt(commandInput.split(" ")[0]);
            int index2 = Integer.parseInt(commandInput.split(" ")[1]);
            moves++;
            if ((index1 < 0 || index1 > inputList.size() - 1) || (index2 < 0 || index2 > inputList.size() - 1)
                    || index1 == index2) {
                inputList.add(inputList.size() / 2, "-" + moves + "a");
                inputList.add(inputList.size() / 2 + 1, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");

            } else {
                String element1 = inputList.get(index1);
                String element2 = inputList.get(index2);
                if (element1.equals(element2)) {
                    if (index1 > index2) {
                        inputList.remove(index1);
                        inputList.remove(index2);
                    } else {
                        inputList.remove(index2);
                        inputList.remove(index1);
                    }

                    System.out.printf("Congrats! You have found matching elements - %s!%n", element1);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (inputList.size() == 0) {
                isEmpty = true;
                break;
            }

            commandInput = scanner.nextLine();
        }
        if (isEmpty) {
            System.out.printf("You have won in %d turns!", moves);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
