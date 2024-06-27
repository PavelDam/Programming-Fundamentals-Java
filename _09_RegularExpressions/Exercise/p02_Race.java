package L09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        //име на състезател -> дистанция
        namesList.forEach(racer -> racersDistances.put(racer, 0));
        String nameRegex = "[A-Za-z]";
        Pattern namePattern = Pattern.compile(nameRegex);

        String distanceRegex = "[0-9]";
        Pattern distancePattern = Pattern.compile(distanceRegex);

        while (!input.equals("end of race")) {

            Matcher nameMatcher = namePattern.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();

            while (nameMatcher.find()) {
                nameBuilder.append(nameMatcher.group());
            }

            Matcher distanceMatcher = distancePattern.matcher(input);
            int distance = 0;
            while (distanceMatcher.find()) {
                int currentDigit = Integer.parseInt(distanceMatcher.group());
                distance += currentDigit;
            }
            String racerName = nameBuilder.toString();

            if (namesList.contains(racerName)){
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }

        System.out.printf("1st place: %s%n",namesList.get(0));
        System.out.printf("2nd place: %s%n",namesList.get(1));
        System.out.printf("3rd place: %s%n",namesList.get(2));

    }
}
