package L05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            //1.команда add{passengers}-добавя вагон накрая на листа с определен брой пасажери
            if (commandArr[0].equals("Add")) {
                int passengers = Integer.parseInt(command.split("\\s+")[1]);
                wagonsList.add(passengers);
                //2.Команда {passengers}-намираме вагон който може да събере пътниците
            } else {
                int passengersToLoad = Integer.parseInt(commandArr[0]);
                for (int i = 0; i <= wagonsList.size() - 1; i++) {
                    if (passengersToLoad + wagonsList.get(i) <= maxCapacity) {
                        wagonsList.set(i, wagonsList.get(i) + passengersToLoad);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
