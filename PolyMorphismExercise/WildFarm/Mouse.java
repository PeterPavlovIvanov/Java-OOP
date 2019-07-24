package PolymorphismExercise.WildFarm;

public class Mouse extends Mammal {

    protected Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("PolymorphismExercise.WildFarm.Vegetable")) {
            super.setFoodEaten(food.getQuantity());
        }else{
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
