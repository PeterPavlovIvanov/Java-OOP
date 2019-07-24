package PolymorphismExercise.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicleData = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(vehicleData[1]),
                Double.parseDouble(vehicleData[2]));

        vehicleData = scanner.nextLine().split("\\s+");

        Vehicle truck = new Truck(Double.parseDouble(vehicleData[1]),
                Double.parseDouble(vehicleData[2]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");
            if ("Drive".equals(command[0])) {
                if ("PolymorphismExercise.VehiclesExtension.Car".equals(command[1])) {
                    System.out.println(car.drive(Double.parseDouble(command[2])));
                } else {
                    System.out.println(truck.drive(Double.parseDouble(command[2])));
                }
            } else if ("Refuel".equals(command[0])) {
                if ("PolymorphismExercise.VehiclesExtension.Car".equals(command[1])) {
                    car.reFuel(Double.parseDouble(command[2]));
                } else {
                    truck.reFuel(Double.parseDouble(command[2]));
                }
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());

    }

//    public PolymorphismExercise.VehiclesExtension.Vehicle produceVehicle(String[] data) {
//
//        PolymorphismExercise.VehiclesExtension.Vehicle vehicle = null;
//
//        if (data[0].equals("PolymorphismExercise.VehiclesExtension.Car")) {
//            vehicle = new PolymorphismExercise.VehiclesExtension.Car(Double.parseDouble(data[1]),
//                    Double.parseDouble(data[2]));
//        } else {
//            vehicle = new PolymorphismExercise.VehiclesExtension.Truck(Double.parseDouble(data[1]),
//                    Double.parseDouble(data[2]));
//        }
//
//        return vehicle;
//
//    }
}
