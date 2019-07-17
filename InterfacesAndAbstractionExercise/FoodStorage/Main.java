package InterfacesAndAbstractionExercise.FoodStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            if (tokens.length == 4) {
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthDate = tokens[3];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                citizens.add(citizen);
            } else if (tokens.length == 3) {
                int age = Integer.parseInt(tokens[1]);
                String group = tokens[2];

                Rebel rebel = new Rebel(name, age, group);
                rebels.add(rebel);
            }
        }

        String name = scanner.nextLine();
        int totalFoodBought = 0;

        while (!name.equals("End")) {
            for (int i = 0; i < citizens.size(); i++) {
                if (citizens.get(i).getName().equals(name)) {
                    citizens.get(i).buyFood();
                    totalFoodBought += 10;
                }
            }
            for (int i = 0; i < rebels.size(); i++) {
                if (rebels.get(i).getName().equals(name)) {
                    rebels.get(i).buyFood();
                    totalFoodBought += 5;
                }
            }

            name = scanner.nextLine();
        }

        System.out.println(totalFoodBought);

    }
}
