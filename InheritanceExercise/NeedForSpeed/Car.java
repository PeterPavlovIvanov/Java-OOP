package InheritanceExercise.NeedForSpeed;

public class Car extends Vehicle {
    private static final double DEFAILT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAILT_FUEL_CONSUMPTION);
    }
}
