package L03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        boolean isEmpty = false;

        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split(" ");
            switch (commandArray[0]) {
                case "Loot":
                    for (int lootIndex = 1; lootIndex <= commandArray.length - 1; lootIndex++) {
                        String currentLoot = commandArray[lootIndex];
                        boolean isDifferent = true;
                        for (int chestIndex = 0; chestIndex <= treasureChest.length - 1; chestIndex++) {
                            if (currentLoot.equals(treasureChest[chestIndex])) {
                                isDifferent = false;
                                break;
                            }
                        }
                        if (isDifferent) {
                            String newChest = commandArray[lootIndex] + " " + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandArray[1]);
                    if (dropIndex >= 0 && dropIndex <= treasureChest.length - 1) {
                        String dropItem = treasureChest[dropIndex];
                        for (int i = dropIndex; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = dropItem;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(commandArray[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < treasureChest.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(treasureChest[treasureChest.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[treasureChest.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = treasureChest[i];
                        }
                        treasureChest = tempChest;

                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                        isEmpty = true;
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
        int treasureLength = 0;
        if (!isEmpty) {
            for (int i = 0; i <= treasureChest.length - 1; i++) {
                treasureLength += treasureChest[i].length();
            }
            double average = 1.0 * treasureLength / treasureChest.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}

