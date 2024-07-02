package MidExams.MidExamRetake_07_2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("End")) {
            String[] inputArr = commandInput.split(" ");
            String command = inputArr[0];

            //1.Shoot {index} {power}-ако индеска е валиден намаляваме стойността на елемента на {index} с {power}
            //                        ако елемента на {index}- {power} <= 0 премахваме елемента на {index}
            switch (command) {
                case "Shoot":
                    int shootIndex = Integer.parseInt(inputArr[1]);
                    int power = Integer.parseInt(inputArr[2]);
                    if (shootIndex >= 0 && shootIndex <= numList.size() - 1) {
                        int shootElement = numList.get(shootIndex);
                        shootElement -= power;
                        numList.set(shootIndex, shootElement);
                        if (numList.get(shootIndex) <= 0) {
                            numList.remove(shootIndex);
                        }
                    }
                    break;
                //2.Add {index} {value}-поставяме (set) {value} на {index} ако е валиден
                //                ако е невалиде принт: "Invalid placement!"
                case "Add":
                    int addIndex = Integer.parseInt(inputArr[1]);
                    int value = Integer.parseInt(inputArr[2]);

                    if (addIndex >= 0 && addIndex <= numList.size() - 1) {
                        numList.add(addIndex, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                //3.Strike {index} {radius}- премахваме елемента на {index} и елементите преди и след него в зависимост от {radius}
                //                           ако някой от елементите е невалиден принт:"Strike missed!" и пропускаме командата
                case "Strike":
                    int strikeIndex = Integer.parseInt(inputArr[1]);
                    int radius = Integer.parseInt(inputArr[2]);
                    if (strikeIndex - radius >= 0 && strikeIndex + radius <= numList.size() - 1) {
                        //!!!Изтриване на повече от един елемент от листа!!!
                        numList.subList(strikeIndex - radius, strikeIndex + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        //4.End- принт: елементите на листа разделени с "|"
        for (int i = 0; i <= numList.size() - 1; i++) {
            if (i < numList.size() - 1) {
                System.out.print(numList.get(i) + "|");
            } else {
                System.out.print(numList.get(i));
            }
        }
    }
}
