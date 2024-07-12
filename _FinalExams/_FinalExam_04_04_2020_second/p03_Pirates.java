package FinalExams.FinalExam04042020second;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> cityMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {
            String city = input.split("\\|+")[0];
            int population = Integer.parseInt(input.split("\\|+")[1]);
            int gold = Integer.parseInt(input.split("\\|+")[2]);

            if (!cityMap.containsKey(city)) {
                cityMap.put(city, new ArrayList<>());
                cityMap.get(city).add(population);
                cityMap.get(city).add(gold);
            } else {
                int currentPopulation = cityMap.get(city).get(0);
                int currentGold = cityMap.get(city).get(1);
                cityMap.get(city).set(0, currentPopulation + population);
                cityMap.get(city).set(1, currentGold + gold);
            }
            input = scanner.nextLine();
        }
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("End")) {
            String command = inputCommand.split("=>")[0];
            String town = inputCommand.split("=>")[1];

            switch (command) {
                case "Plunder":
                    //команда: Plunder=>{town}=>{people}=>{gold}
                    //         принтираме: "{town} plundered! {gold} gold stolen, {people} citizens killed.
                    //         ако популацията или златото (population) || (gold) от мап-а = 0, града е разпуснат
                    //         премахваме {town} от мап-а и принтираме: "{town} has been wiped off the map!"
                    int killedPeoples = Integer.parseInt(inputCommand.split("=>")[2]);
                    int plunderGold = Integer.parseInt(inputCommand.split("=>")[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, plunderGold, killedPeoples);

                    int currentPopulation = cityMap.get(town).get(0);
                    int currentGold = cityMap.get(town).get(1);

                    cityMap.get(town).set(0, currentPopulation - killedPeoples);
                    cityMap.get(town).set(1, currentGold - plunderGold);

                    if (currentGold-plunderGold == 0 || currentPopulation-killedPeoples == 0) {
                        cityMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    //команда: Prosper=>{town}=>{gold}
                    //         увеличаваме gold от мап-а с {gold}
                    //         принтираме: "{gold added} gold added to the city treasury. {town} now has {total gold} gold."
                    //         ako {gold} е отрицателно число принтираме: "Gold added cannot be a negative number!" и пропускаме
                    int prosperGold = Integer.parseInt(inputCommand.split("=>")[2]);
                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int goldToIncrease = cityMap.get(town).get(1);
                        goldToIncrease += prosperGold;
                        cityMap.get(town).set(1, goldToIncrease);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperGold, town, goldToIncrease);
                    }
                    break;
            }
            inputCommand = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityMap.size());
        cityMap.entrySet().stream()
                .forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
