package L05Lists.Exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        //Note: The index given may be outside the array's bounds. In that case, print "Invalid index".

        while (!command.equals("End")) {
            //1.Add {number} - add number at the end
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(numberToAdd);

                //2.Insert {number} {index} - слагаме числото на дадения индекс
            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int indexToInsert = Integer.parseInt(command.split("\\s+")[2]);
                if (indexToInsert >= 0 && indexToInsert <= numbersList.size() - 1) {
                    numbersList.add(indexToInsert, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
                //3.Remove {index} - изтриваме индеска
            } else if (command.contains("Remove")) {
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);
                if (indexToRemove >= 0 && indexToRemove <= numbersList.size() - 1) {
                    numbersList.remove(indexToRemove);

                } else {
                    System.out.println("Invalid index");
                }

                //4.Shift left {count} - първото число става последно 'count' пъти
            } else if (command.contains("Shift left")) {
                int leftCount = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= leftCount; i++) {
                    int numToShiftLeft = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(numToShiftLeft);
                }
                //5.Shift right {count} - последното число става първо 'count' пъти
            } else if (command.contains("Shift right")) {
                int rightCount = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= rightCount; i++) {
                    int numToShiftRight = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, numToShiftRight);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
