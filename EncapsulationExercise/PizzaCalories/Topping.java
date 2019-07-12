package EncapsulationExercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;
    private double modifier;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if ("Meat".equals(toppingType)) {
            modifier = 1.2;
        } else if ("Veggies".equals(toppingType)) {
            modifier = 0.8;
        } else if ("Cheese".equals(toppingType)) {
            modifier = 1.1;
        } else if ("Sauce".equals(toppingType)) {
            modifier = 0.9;
        } else {
            throw new IllegalArgumentException(String.format(
                    "Cannot place %s on top of your pizza.",
                    this.toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2.00 * this.weight * modifier;
    }
}
