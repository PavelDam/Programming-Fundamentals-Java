package L07AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 1; i <= count; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String command = inputArr[0];

            switch (command) {
                case "register":
                    //register {username} {licensePlateNumber} -може да се регистрира само един номер,
                    // ако username се опита да регистрира друг номер на негово име да се принтира:
                    //ERROR: already registered with plate number {licensePlateNumber}
                    //ако не е регистриран се записва и се принтира:{username} registered {licensePlateNumber} successfully
                    String name = inputArr[1];
                    String licensePlate = inputArr[2];
                    if (!parkingMap.containsKey(name)) {
                        parkingMap.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                    }
                    break;

                case "unregister":
                    //unregister {username}-ako username не е записан принтираме:ERROR: user {username} not found
                    //ако вече е записан принтиране: {username} unregistered successfully
                    String unregName = inputArr[1];

                    if (parkingMap.containsKey(unregName)) {
                        System.out.printf("%s unregistered successfully%n", unregName);
                        parkingMap.remove(unregName);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", unregName);
                    }
                    break;
            }
        }
        //след приключване на програмата принтираме записаните: {username} => {licensePlateNumber}
        parkingMap.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
    }
}
