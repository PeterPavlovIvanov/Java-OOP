package PolymorphismLab.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(5.0, 5.0);
        Shape shape1 = new Circle(5.0);

        shape.calculateArea();
        shape.calculateArea();

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

    }
}
