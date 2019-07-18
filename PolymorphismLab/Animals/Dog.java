package PolymorphismLab.Animals;

public class Dog extends Animal {
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am Rocky and my favourite food is PolymorphismExercise.WildFarm.PolymorphismExercise.WildFarm.Meat\r\n" +
                "DJAAF";
    }
}
