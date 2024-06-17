package L06ObjectsAndClasses.Exercise.P05VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int power;

    public Vehicle(String type, String model, String color, int power) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        String formatted = "";
        if (this.type.equals("car")){
            formatted = "Car";
        } else if (this.type.equals("truck")) {
            formatted = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formatted, this.model, this.color, this.power);
    }
}
