package EncapsulationExercise.ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setLength(double length) {
        validateValue(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validateValue(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validateValue(height, "Height");
        this.height = height;
    }

    private void validateValue(double value, String dimensionName) {
        if (value <= 0) {
            throw new IllegalArgumentException(
                    dimensionName + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width +
                2 * this.length * this.height +
                2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        return ((2 * width) + (2 * length)) * height;
    }

    public double calculateVolume() {
        return this.width * this.height * this.length;
    }

//Surface Area - 52.00
//Lateral Surface Area - 40.00
//Volume – 24.00

}
