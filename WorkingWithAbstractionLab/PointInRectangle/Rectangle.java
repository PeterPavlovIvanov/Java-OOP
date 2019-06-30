package WorkingWithAbstractionLab.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean checkX = false;
        if (point.getX() >= this.bottomLeft.getX() && point.getX() <= this.topRight.getX()) {
            checkX = true;
        }

        boolean checkY = false;
        if (point.getY() >= this.bottomLeft.getY() && point.getY() <= this.topRight.getY()) {
            checkY = true;
        }

        return checkX && checkY;
    }
}
