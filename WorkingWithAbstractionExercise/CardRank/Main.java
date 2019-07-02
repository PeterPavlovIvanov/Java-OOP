package WorkingWithAbstractionExercise.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println("Card Ranks:");

        CardRank[] enums = CardRank.values();

        for (CardRank value : enums) {
            System.out.println(String.format(
                    "Ordinal value: %d; Name value: %s",
                    value.ordinal(),value));
        }
    }
}
