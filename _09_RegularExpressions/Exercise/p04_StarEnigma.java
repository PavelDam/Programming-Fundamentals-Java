package L09RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        int attackedPlanets = 0;
        int destroyedPlanets = 0;

        List<String>attackedPlanetsList = new ArrayList<>();
        List<String>destroyedPlanetsList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            int key = 0;
            for (char symbol : input.toCharArray()) {
                if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r' || symbol == 'S' || symbol == 'T' || symbol == 'A' || symbol == 'R') {
                    key++;
                }
            }
            StringBuilder decryptBuilder = new StringBuilder();
            for (char symbol : input.toCharArray()) {
                symbol -= key;
                decryptBuilder.append(symbol);
            }
            String decryptMessage = decryptBuilder.toString();
            Matcher matcher = pattern.matcher(decryptMessage);


            if (matcher.find()){
            String planet = matcher.group("planet");
            String population = matcher.group("population");
            String attackType = matcher.group("attackType");
            String soldierCount = matcher.group("soldierCount");
                switch (attackType){
                    case"A":
                        attackedPlanets++;
                        attackedPlanetsList.add(planet);
                        break;
                    case"D":
                        destroyedPlanets++;
                        destroyedPlanetsList.add(planet);
                        break;
                }
            }
        }
        Collections.sort(attackedPlanetsList);
        Collections.sort(destroyedPlanetsList);
        System.out.printf("Attacked planets: %d%n",attackedPlanets);
        attackedPlanetsList.forEach(planet -> System.out.printf("-> %s%n",planet));
        System.out.printf("Destroyed planets: %d%n",destroyedPlanets);
        destroyedPlanetsList.forEach(planet-> System.out.printf("-> %s%n",planet));
    }
}
