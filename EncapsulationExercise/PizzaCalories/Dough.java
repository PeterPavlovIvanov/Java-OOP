package EncapsulationExercise.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;
    private double flourModifier;
    private double bakingModifier;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("EncapsulationExercise.PizzaCalories.Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if ("Wholegrain".equals(flourType)) {
            flourModifier = 1.0;
        } else if ("White".equals(flourType)) {
            flourModifier = 1.5;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if ("Crispy".equals(bakingTechnique)) {
            bakingModifier = 0.9;
        } else if ("Chewy".equals(bakingTechnique)) {
            bakingModifier = 1.1;
        } else if ("Homemade".equals(bakingTechnique)) {
            bakingModifier = 1.0;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        return 2.00 * this.weight * flourModifier * bakingModifier;
    }

}

