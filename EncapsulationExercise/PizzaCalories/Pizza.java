package EncapsulationExercise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.length() > 15 || name.length() < 1 || name.trim().isEmpty()) {
            throw new IllegalArgumentException("EncapsulationExercise.PizzaCalories.Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public double getOverallCalories() {
        double result = this.dough.calculateCalories();

        for (int i = 0; i < this.toppings.size(); i++) {
            result += this.toppings.get(i).calculateCalories();
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",
                this.getName(),
                this.getOverallCalories());
    }

}
