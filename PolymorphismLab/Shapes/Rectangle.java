package PolymorphismLab.Shapes;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        double result =  2 * (this.getHeight() + this.getWidth());
        super.setPerimeter(result);
    }

    @Override
    public void calculateArea() {
        Double result = this.getWidth() * this.getHeight();
        super.setArea(result);
    }

    private final Double getHeight() {
        return this.height;
    }

    private final Double getWidth() {
        return this.width;
    }
}
