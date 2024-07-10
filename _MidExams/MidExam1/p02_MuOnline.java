package MidExams.MidExam1;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomsArr = scanner.nextLine().split("\\|");
        int health = 100;
        int totalBitcoins = 0;

        for (int i = 0; i <= roomsArr.length - 1; i++) {
            String[] commandArr = roomsArr[i].split("\\s+");
            String command = commandArr[0];

            switch (command) {
                case "potion":
                    int addHealth = Integer.parseInt(commandArr[1]);
                    int neededHp = 0;
                    if (health + addHealth > 100) {
                        neededHp = 100 - health;
                        health = 100;
                        System.out.printf("You healed for %d hp.%n", neededHp);
                    } else {
                        health += addHealth;
                        System.out.printf("You healed for %d hp.%n", addHealth);
                    }

                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    int bitcoins = Integer.parseInt(commandArr[1]);
                    System.out.printf("You found %d bitcoins.%n", bitcoins);
                    totalBitcoins += bitcoins;
                    break;
                default:
                    String monster = commandArr[0];
                    int takingHp = Integer.parseInt(commandArr[1]);
                    health -= takingHp;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", monster);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", monster);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", totalBitcoins);
        System.out.printf("Health: %d", health);

    }
}
