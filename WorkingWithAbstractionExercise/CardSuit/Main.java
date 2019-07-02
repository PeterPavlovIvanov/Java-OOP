package WorkingWithAbstractionExercise.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println("Card Suits:");

        CardSuit[] enums = CardSuit.values();

        for (CardSuit value : enums) {
            System.out.println(String.format(
                    "Ordinal value: %d; Name value: %s",
                    value.ordinal(),value));
        }

    }
}
