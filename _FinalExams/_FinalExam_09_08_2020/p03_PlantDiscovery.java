package FinalExams.FinalExam09082020;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plantCount = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantMap = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRatingMap = new LinkedHashMap<>();

        for (int i = 1; i <= plantCount; i++) {
            String[] inputPlant = scanner.nextLine().split("<->");
            String plantName = inputPlant[0];
            int plantRarity = Integer.parseInt(inputPlant[1]);

            plantMap.put(plantName, plantRarity);
            plantsRatingMap.put(plantName, new ArrayList<>());


        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String command = input.split(":")[0];
            String plant = input.split(" ")[1];
            if (!plantMap.containsKey(plant)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }
            switch (command) {
                case "Rate":
                    //•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)

                    Double rate = Double.parseDouble(input.split(" ")[3]);
                    plantsRatingMap.get(plant).add(rate);
                    break;
                case "Update":
                    //•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one

                    int newRarity = Integer.parseInt(input.split(" ")[3]);
                    plantMap.put(plant, newRarity);
                    break;
                case "Reset":
                    //•	"Reset: {plant}" – remove all the ratings of the given plant

                    plantsRatingMap.get(plant).clear();
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        plantMap.entrySet().stream()
                .forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        entry.getKey(), entry.getValue(),
                        plantsRatingMap.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0)));

    }
}
