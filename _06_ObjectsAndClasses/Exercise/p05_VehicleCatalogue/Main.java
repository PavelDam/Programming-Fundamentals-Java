package L06ObjectsAndClasses.Exercise.P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!inputLine.equals("End")) {
            String[] infoArr = inputLine.split(" ");
            String type = infoArr[0];
            String model = infoArr[1];
            String color = infoArr[2];
            int power = Integer.parseInt(infoArr[3]);

            Vehicle vehicle = new Vehicle(type, model, color, power);
            vehicleList.add(vehicle);

            inputLine = scanner.nextLine();
        }
        String modelOfVehicle = scanner.nextLine();

        while (!modelOfVehicle.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (modelOfVehicle.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }

            modelOfVehicle = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAveragePower(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAveragePower(vehicleList, "trucks"));
    }

    private static double getAveragePower(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getPower();
                    count++;
                }
            }

        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getPower();
                    count++;
                }
            }
        }
        if (sum == 0){
            return 0;
        }
        return sum / count;
    }
}
