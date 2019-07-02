package WorkingWithAbstractionExercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = parser(scanner.nextLine());
        int x = dimensions[0];
        int y = dimensions[1];

        GalaxyMatrix galaxyMatrix = new GalaxyMatrix(x,y);
        int[][] matrix = galaxyMatrix.getMatrix();

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] ivoS = parser(command);
            int colI = ivoS[0];
            int rowI = ivoS[1];

            int[] evil = parser(scanner.nextLine());
            int colE = evil[0];
            int rowE = evil[1];

            while (colE >= 0 && rowE >= 0) {
                if (colE < matrix.length && rowE < matrix[0].length) {
                    matrix[colE][rowE] = 0;
                }
                colE--;
                rowE--;
            }

            while (colI >= 0 && rowI < matrix[1].length) {
                if (colI < matrix.length && rowI >= 0 && rowI < matrix[0].length) {
                    sum += matrix[colI][rowI];
                }

                rowI++;
                colI--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);

    }

    public static int[] parser(String input) {
        return Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
