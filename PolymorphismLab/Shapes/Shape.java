package PolymorphismLab.Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public abstract void calculatePerimeter();

    public abstract void calculateArea();

    public double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return this.area;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}
