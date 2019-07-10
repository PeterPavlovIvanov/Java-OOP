package InheritanceExercise.NeedForSpeed;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSU0MPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = getDefaultFuelConsu0mption();
    }

    public void drive(double kilometers) {
        double fuelCost = this.fuelConsumption * kilometers;
        if (fuelCost <= this.fuel) {
            this.fuel -= fuelCost;
        }
    }

    public static double getDefaultFuelConsu0mption() {
        return DEFAULT_FUEL_CONSU0MPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
