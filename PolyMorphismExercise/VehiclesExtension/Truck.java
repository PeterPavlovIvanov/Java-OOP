package PolymorphismExercise.VehiclesExtension;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void reFuel(double fuel) {
        super.reFuel(fuel * 0.95);
    }

}
