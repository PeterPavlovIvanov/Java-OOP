package PolymorphismExercise.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        List<Animal> farm = new ArrayList<>();

        while (true) {
            if (input1.equals("End")) {
                break;
            }
            String[] animalData = input1.split("\\s+");
            String[] foodData = input2.split("\\s+");

            Animal animal = animalGenerator(animalData[0], animalData);
            Food food = foodGenerator(foodData[0], Integer.parseInt(foodData[1]));

            animal.makeSound();
            animal.eat(food);
            //System.out.println(animal.toString());
            farm.add(animal);

            input1 = scanner.nextLine();
            if (input1.equals("End")) {
                break;
            }

            input2 = scanner.nextLine();
            if (input2.equals("End")) {
                break;
            }
        }

        for (int i = 0; i < farm.size(); i++) {
            System.out.println(farm.get(i).toString());
        }

    }

    private static Food foodGenerator(String type, int quantity) {
        Food food = null;

        if (type.equals("PolymorphismExercise.WildFarm.Vegetable")) {
            food = new Vegetable(quantity);
        } else {
            food = new Meat(quantity);
        }

        return food;
    }

    private static Animal animalGenerator(String type, String[] animalData) {
        Animal animal = null;

        if (type.equals("PolymorphismExercise.WildFarm.Cat")) {
            animal = new Cat(animalData[0], animalData[1],
                    Double.parseDouble(animalData[2]), animalData[3],
                    animalData[4]);
        } else if (type.equals("PolymorphismExercise.WildFarm.Tiger")) {
            animal = new Tiger(animalData[0], animalData[1],
                    Double.parseDouble(animalData[2]), animalData[3]);
        } else if (type.equals("PolymorphismExercise.WildFarm.Mouse")) {
            animal = new Mouse(animalData[0], animalData[1],
                    Double.parseDouble(animalData[2]), animalData[3]);
        } else if (type.equals("PolymorphismExercise.WildFarm.Zebra")) {
            animal = new Zebra(animalData[0], animalData[1],
                    Double.parseDouble(animalData[2]), animalData[3]);
        }

        return animal;
    }

}
