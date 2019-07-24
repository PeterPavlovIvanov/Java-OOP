package PolymorphismExercise.VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicleData = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(vehicleData[1]),
                Double.parseDouble(vehicleData[2]), Double.parseDouble(vehicleData[3]));

        vehicleData = scanner.nextLine().split("\\s+");

        Vehicle truck = new Truck(Double.parseDouble(vehicleData[1]),
                Double.parseDouble(vehicleData[2]), Double.parseDouble(vehicleData[3]));

        vehicleData = scanner.nextLine().split("\\s+");

        Vehicle bus = new Bus(Double.parseDouble(vehicleData[1]),
                Double.parseDouble(vehicleData[2]), Double.parseDouble(vehicleData[3]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            if ("Drive".equals(command[0])) {
                if ("PolymorphismExercise.VehiclesExtension.Car".equals(command[1])) {
                    System.out.println(car.drive(Double.parseDouble(command[2])));
                } else if("PolymorphismExercise.VehiclesExtension.Truck".equals(command[1])){
                    System.out.println(truck.drive(Double.parseDouble(command[2])));
                } else if("PolymorphismExercise.VehiclesExtension.Bus".equals(command[1])){
                    System.out.println(bus.drive(Double.parseDouble(command[2])));
                }
            } else if ("Refuel".equals(command[0])) {
                if ("PolymorphismExercise.VehiclesExtension.Car".equals(command[1])) {
                    car.reFuel(Double.parseDouble(command[2]));
                } else if("PolymorphismExercise.VehiclesExtension.Truck".equals(command[1])) {
                    truck.reFuel(Double.parseDouble(command[2]));
                } else if("PolymorphismExercise.VehiclesExtension.Bus".equals(command[1])){
                    bus.reFuel(Double.parseDouble(command[2]));
                }
            } else if ("DriveEmpty".equals(command[0])) {
                bus.setAirConditionIsOn();
                System.out.println(bus.drive(Double.parseDouble(command[2])));
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());

    }
}
