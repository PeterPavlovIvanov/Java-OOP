package EncapsulationExercise.ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();
        int count = 0;

        try {
            while (!"END".equals(input = scanner.nextLine())) {
                count++;
                String name;
                double money;
                Person person = null;
                Product product = null;
                if (input.contains(";")) {
                    String[] data = input.split(";");
                    for (int i = 0; i < data.length; i++) {
                        String[] tokens = data[i].split("=");
                        name = tokens[0];
                        money = Integer.parseInt(tokens[1]);
                        if (count == 1) {
                            person = new Person(name, money);
                            people.put(name, person);
                        } else {
                            product = new Product(name, money);
                            products.put(name, product);
                        }
                    }
                } else if (input.contains("=")) {
                    String[] data = input.split("=");
                    name = data[0];
                    money = Integer.parseInt(data[1]);
                    if (count == 1) {
                        person = new Person(name, money);
                        people.put(name, person);
                    } else {
                        product = new Product(name, money);
                        products.put(name, product);
                    }

                } else {
                    String[] tokens = input.split("\\s+");
                    String personName = tokens[0];
                    String productName = tokens[1];

                    person = new Person(personName, people.get(personName).getMoney());
                    product = new Product(productName, products.get(productName).getCost());
                    person.buyProduct(product);

                }
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}