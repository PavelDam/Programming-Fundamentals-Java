package FinalExams.FinalExam09082020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<delimiter>[=/])(?<destination>[A-Z][A-Za-z]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int points = 0;
        List<String> destinationList = new ArrayList<>();

        while (matcher.find()) {

            String destination = matcher.group("destination");
            points += destination.length();
            destinationList.add(destination);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinationList));
        System.out.printf("Travel Points: %d", points);
    }
}
