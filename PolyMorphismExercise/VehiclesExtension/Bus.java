package PolymorphismExercise.VehiclesExtension;

public class Bus extends Vehicle {
private static final double ADDITIONAL_CONSUMPTION = 1.4;

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, ADDITIONAL_CONSUMPTION);
    }

//    @Override
//    public void setAirConditionIsOn(){
//        //super.airConditionIsOn = false;
//        this.setFuelConsumption(super.getFuelConsumption());
//    }
//
//    @Override
//    protected void setFuelConsumption(double fuelConsumption){
//        double temp = fuelConsumption - ADDITIONAL_CONSUMPTION - ADDITIONAL_CONSUMPTION;
//        super.setFuelConsumption(temp);
//    }

}
