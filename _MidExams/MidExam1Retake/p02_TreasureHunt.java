package MidExams.MidExam1Retake;

import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();
        boolean isEmpty = false;

        while (!command.equals("Yohoho!")) {
            String[] commandArr = command.split(" ");

            switch (commandArr[0]) {
                //команда Loot {item1} {itemn}->взимаме елементите item1,item2 и ги поставяме в началото на листа
                //                                      ако елемент вече се съдържа го пропускаме
                case "Loot":
                    for (int i = 1; i <= commandArr.length - 1; i++) {
                        String lootItem = commandArr[i];
                        if (!treasureChest.contains(lootItem)) {
                            treasureChest.add(0, lootItem);
                        }
                    }
                    break;
                //команда Drop{index}-> премахваме елемента от позиция {index} и го поставяме в края на листа
                //                      ако индекса е невалите пропускаме командата
                case "Drop":
                    int dropIndex = Integer.parseInt(commandArr[1]);
                    if (dropIndex >= 0 && dropIndex <= treasureChest.size() - 1) {
                        String dropItem = treasureChest.get(dropIndex);
                        treasureChest.remove(dropIndex);
                        treasureChest.add(dropItem);
                    }
                    break;
                //команда Steal{count}-> премахваме последните {count} елементи от листа
                //                       ако има по-малко елементи в листа от {count} ги премахваме всички
                //                      Печатаме откраднатите елементи разделени с ", "
                case "Steal":
                    int stealCount = Integer.parseInt(commandArr[1]);
                    if (stealCount < treasureChest.size()) {
                        for (int i = stealCount; i > 0; i--) {
                            String stealItem = treasureChest.get(treasureChest.size() - i);
                            if (i > 1) {
                                System.out.print(stealItem + ", ");
                            } else {
                                System.out.print(stealItem);
                            }
                            treasureChest.remove(treasureChest.size() - i);
                        }
                    } else {
                        isEmpty = true;
                        System.out.print(treasureChest.toString().replaceAll("[\\[\\]]", ""));
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
        if (isEmpty) {
            System.out.println("Failed treasure hunt.");
        } else {
            int totalLength = 0;

            for (int i = 0; i <= treasureChest.size() - 1; i++) {
                String item = treasureChest.get(i);
                int itemLength = item.length();
                totalLength += itemLength;
            }
            double average = 1.0 * totalLength / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }
    }
}
