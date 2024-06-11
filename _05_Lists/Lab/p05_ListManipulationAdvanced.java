package L05Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            switch (commandArr[0]) {

                case "Contains":
                    int num = Integer.parseInt(commandArr[1]);
                    boolean chek = inputList.contains(num);
                    if (chek) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int item : inputList) {
                            if (item % 2 == 0) {
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandArr[1].equals("odd")) {
                        for (int item : inputList) {
                            if (item % 2 != 0) {
                                System.out.print(item + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < inputList.size(); i++) {
                        int currentNum = inputList.get(i);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(commandArr[2]);
                    switch (commandArr[1]) {
                        case "<":
                            for (int item : inputList) {
                                if (item < number) {
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int item : inputList) {
                                if (item > number) {
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int item : inputList) {
                                if (item >= number) {
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int item : inputList) {
                                if (item <= number) {
                                    System.out.print(item + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

            }


            command = scanner.nextLine();
        }
    }
}
