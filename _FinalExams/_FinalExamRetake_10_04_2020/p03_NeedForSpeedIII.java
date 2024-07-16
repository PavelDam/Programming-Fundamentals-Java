package FinalExams.FinalExamRetake10042020;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carsCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 1; i <= carsCount; i++) {
            String[] inputArr = scanner.nextLine().split("\\|");
            String car = inputArr[0];
            int mileage = Integer.parseInt(inputArr[1]);
            int fuel = Integer.parseInt(inputArr[2]);

            carsMap.put(car, new ArrayList<>());
            carsMap.get(car).add(mileage);
            carsMap.get(car).add(fuel);
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] commandArr = input.split(" : ");
            String command = commandArr[0];
            String car = commandArr[1];

            switch (command) {
                case "Drive":
                    //команда: Drive : {car} : {distance} : {fuel}
                    //         колата трябва да измине дадената дистанция {distance} и трябва да има необходимото количество гориво{fuel} за това
                    //         ако няма достатъчно налично гориво принтираме: "Not enough fuel to make that ride"
                    //         ако има достатъчно гориво добавяме {distance} към {mileage} в Map-a и намаляме горивото от Мар-а с {fuel}
                    //         принтираме: "{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
                    //         ако {mileage} >= 100 000 премахваме колата от Мар-а и принтираме: "Time to sell the {car}!"
                    int driveFuel = Integer.parseInt(commandArr[3]);
                    int diveDistance = Integer.parseInt(commandArr[2]);

                    int currentMileage = carsMap.get(car).get(0);
                    int currentFuel = carsMap.get(car).get(1);
                    if (currentFuel >= driveFuel) {
                        currentMileage += diveDistance;
                        carsMap.get(car).set(0, currentMileage);
                        currentFuel -= driveFuel;
                        carsMap.get(car).set(1, currentFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, diveDistance, driveFuel);
                        if (carsMap.get(car).get(0) >= 100000) {
                            carsMap.remove(car);
                            System.out.printf("Time to sell the %s!%n", car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    //команда: Refuel : {car} : {fuel}
                    //         зареждаме резервоара на дадената кола {car} с даденото количество гориво {fuel}
                    //         !резервоара НЕ МОЖЕ да събере повече от 75 литра гориво,ако даденото е повече, дозареждаме до 75 литра
                    //         принтираме: "{car} refueled with {fuel} liters"
                    int fuel = Integer.parseInt(commandArr[2]);
                    int refuelFuel = carsMap.get(car).get(1);
                    int neededFuel = 0;
                    if (fuel + refuelFuel > 75) {
                        neededFuel = 75 - refuelFuel;
                        carsMap.get(car).set(1, neededFuel + refuelFuel);
                    } else {
                        neededFuel = fuel;
                        carsMap.get(car).set(1, neededFuel + refuelFuel);
                    }
                    System.out.printf("%s refueled with %d liters%n", car, neededFuel);
                    break;

                case "Revert":
                    //команда: Revert : {car} : {kilometers}
                    //         намаляваме {mileage} на дадената кола {car} с дадените километри {kilometers}
                    //         ако километрите {mileage} станат по-малко от 10 000 след намаляването, сетваме {mileage}=10 000 и не принтираме нищо
                    //         ако километрите {mileage} станат >= 10 000 принтираме: "{car} mileage decreased by {amount reverted} kilometers"
                    int kilometers = Integer.parseInt(commandArr[2]);
                    int mileageToRevert = carsMap.get(car).get(0);
                    if (mileageToRevert - kilometers < 10000) {
                        carsMap.get(car).set(0, 10000);
                    } else {
                        carsMap.get(car).set(0, mileageToRevert - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        //принтираме: "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        carsMap.entrySet().stream()
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
