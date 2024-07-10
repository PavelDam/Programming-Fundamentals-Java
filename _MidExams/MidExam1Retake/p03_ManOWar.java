package MidExams.MidExam1Retake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatusList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShipStatusList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHp = Integer.parseInt(scanner.nextLine());

        String inputCommand = scanner.nextLine();

        boolean pirateShipSink = false;
        boolean warShipSink = false;

        while (!inputCommand.equals("Retire")) {
            String[] commandArr = inputCommand.split("\\s+");
            String command = commandArr[0];

            switch (command) {
                //1.Fire {index} {damage}-пиратския кораб атакува бойния кораб с {damage} на съответния {index}
                //                        ако индеска е невалиде пропускаме командата,
                //                        ако warShipStatusList на дадения {index} <=0 - бойния кораб потъва принт:
                //                        "You won! The enemy ship has sunken." и спираме програмата return;
                case "Fire":
                    int fireIndex = Integer.parseInt(commandArr[1]);
                    int fireDamage = Integer.parseInt(commandArr[2]);
                    if (fireIndex >= 0 && fireIndex <= warShipStatusList.size() - 1) {
                        int warShipSection = warShipStatusList.get(fireIndex);
                        warShipSection -= fireDamage;
                        if (warShipSection <= 0) {
                            warShipSink = true;
                            break;
                        } else {
                            warShipStatusList.set(fireIndex, warShipSection);
                        }
                    }
                    break;
                //2.Defend {startIndex} {endIndex} {damage} - бойния кораб атакува пиратския
                // с {damage} от индекс {startIndex} до {endIndex}, ако индексите са невалидни пропускаме командата
                //        ако pirateShipStatusList на някой индекс <= 0- пиратския кораб потъва принт:
                //                    "You lost! The pirate ship has sunken." и спираме програмата return;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    int defendDamage = Integer.parseInt(commandArr[3]);

                    if (startIndex >= 0 && endIndex <= pirateShipStatusList.size() - 1) {

                        for (int i = startIndex; i <= endIndex; i++) {
                            int pirateShipSection = pirateShipStatusList.get(i);
                            pirateShipSection -= defendDamage;

                            if (pirateShipSection <= 0) {
                                pirateShipSink = true;
                                break;
                            } else {
                                pirateShipStatusList.set(i, pirateShipSection);
                            }
                        }
                    }
                    break;
                //3.Repair {index} {health} - ремонтираме секция от pirateShipStatusList на {index} с {heath}
                //                          до не повече от maxHP,ако индеска е невалиден пропускаме командата.
                case "Repair":
                    int repairIndex = Integer.parseInt(commandArr[1]);
                    int repairHealth = Integer.parseInt(commandArr[2]);
                    if (repairIndex >= 0 && repairIndex <= pirateShipStatusList.size() - 1) {
                        int sectionToRepair = pirateShipStatusList.get(repairIndex);
                        sectionToRepair += repairHealth;
                        if (sectionToRepair > maxHp) {
                            sectionToRepair = maxHp;
                        }
                        pirateShipStatusList.set(repairIndex, sectionToRepair);
                    }
                    break;
                //4.Status - принтираме броя всички секции на pirateShipStatusList, които са по-малки от 20% от maxHp
                //           принт: броя "{count} sections need repair."
                case "Status":
                    int needRepair = 0;
                    for (int i = 0; i <= pirateShipStatusList.size() - 1; i++) {
                        int currentSection = pirateShipStatusList.get(i);
                        if (currentSection < maxHp * 0.2) {
                            needRepair++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", needRepair);
                    break;
            }
            if (warShipSink) {
                System.out.println("You won! The enemy ship has sunken.");
                break;
            }
            if (pirateShipSink) {
                System.out.println("You lost! The pirate ship has sunken.");
                break;
            }


            inputCommand = scanner.nextLine();
        }
        //5.Ако до команда "Retire" няма потънал кораб принтираме статуса(сбора) на елементите на двата кораба
        //                  "Pirate ship status: {pirateShipStatusSum}
        //                  "Warship status: {warShipStatusSum}

        if (!pirateShipSink && !warShipSink) {
            int pirateShipSum = pirateShipStatusList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            int warShipSum = warShipStatusList.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Warship status: %d%n", warShipSum);
        }


    }
}
