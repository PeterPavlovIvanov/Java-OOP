package WorkingWithAbstractionLab;

import java.util.Scanner;

public class RhombusОfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row++) {
            System.out.println(fillLines(row,n));
        }

        for (int row = n-2; row >=0 ; row--) {
            System.out.println(fillLines(row,n));
        }

    }

    public static String fillLines(int row, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = row; i < n - 1; i++) {
            result.append(" ");
        }

        for (int i = 0; i <= row; i++) {
            result.append("* ");
        }

        return result.toString();
    }

}
