package PolymorphismExercise.VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private boolean airConditionIsOn;
    private double additionalConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity, double additionalConsumption) {
        this.tankCapacity = tankCapacity;
        this.setFuelQuantity(fuelQuantity);
        this.setAirConditionIsOn();
        this.additionalConsumption = additionalConsumption;
        this.setFuelConsumption(fuelConsumption);
    }

    protected void setFuelConsumption(double fuelConsumption) {
        if (airConditionIsOn) {
            this.fuelConsumption = fuelConsumption + additionalConsumption;
        } else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    protected void setAirConditionIsOn() {
        this.airConditionIsOn = true;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (fuelQuantity > tankCapacity) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.fuelQuantity = fuelQuantity;
            }
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String drive(double distance) {
        String output = null;
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded <= this.fuelQuantity) {
            this.fuelQuantity -= fuelNeeded;

            DecimalFormat format = new DecimalFormat(
                    "#.##");

            output = String.format(
                    "%s travelled %s km",
                    this.getClass().getSimpleName(),
                    format.format(distance));
        } else {
            output = String.format("%s needs refueling",
                    this.getClass().getSimpleName());
        }

        return output;
    }

    public void reFuel(double fuel) {
        if (fuel <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (fuelQuantity + fuel > tankCapacity) {
                System.out.println("Cannot fit fuel in tank");
            } else {
                this.fuelQuantity += fuel;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
