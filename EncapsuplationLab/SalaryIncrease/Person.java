package EncapsuplationLab.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus /= 2.0;
        }

        bonus /= 100;

        double increasedSalary = this.getSalary() * (1 + bonus);
        this.setSalary(increasedSalary);
    }

    private double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return this.getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return String.format(
                "%s gets %f leva",
                this.getFullName(), this.getSalary());
    }

}
