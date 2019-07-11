package EncapsuplationLab.ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
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

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException(
                    "First name cannot be less than 3 symbols\n");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException(
                    "Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(
                    "Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException(
                    "Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "%s gets %f leva",
                this.getFullName(), this.getSalary());
    }

}
