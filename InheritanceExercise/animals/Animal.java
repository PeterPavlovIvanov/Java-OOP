package InheritanceExercise.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.setAge(age);
        this.setGender(gender);
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female")) {

        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract String produceSound();

    @Override
    public String toString() {
        String result = this.getClass().getSimpleName() + "\r\n";
        result += this.getName() + " " + this.getAge() + " " + this.getGender() + "\r\n";
        result += this.produceSound() + "\r\n";
        return result;
    }

}
