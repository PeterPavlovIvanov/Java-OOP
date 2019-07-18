package PolymorphismLab.Animals;

public class Cat extends Animal {
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am Oscar and my favourite food is Whiskas\r\n" +
                "MEEOW";
    }
}
