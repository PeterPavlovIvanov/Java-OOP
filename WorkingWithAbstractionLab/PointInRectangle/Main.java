package WorkingWithAbstractionLab.PointInRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(input[0]);
        int second = Integer.parseInt(input[1]);
        int third = Integer.parseInt(input[2]);
        int fourth = Integer.parseInt(input[3]);

        Point bottomLeft = new Point(first, second);
        Point topRight = new Point(third, fourth);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] pointStats = scanner.nextLine().split("\\s+");
            int x = Integer.parseInt(pointStats[0]);
            int y = Integer.parseInt(pointStats[1]);

            Point point = new Point(x, y);

            System.out.println(rectangle.contains(point));
        }

    }
}
