package PolymorphismLab.Shapes;

public class Circle extends Shape {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        Double result = 2 * Math.PI * this.getRadius();
        super.setPerimeter(result);
    }

    @Override
    public void calculateArea() {
        Double result = Math.PI * Math.pow(this.getRadius(), 2);
        super.setArea(result);
    }

    private final Double getRadius() {
        return this.radius;
    }
}
