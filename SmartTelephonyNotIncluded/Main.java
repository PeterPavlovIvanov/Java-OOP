package InterfacesAndAbstractionExercise.SmartTelephonyNotIncluded;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lineOfNumbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> lineOfSites = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(lineOfNumbers, lineOfSites);

        int numbersSize = smartphone.getNumbers().size();
        for (int i = 0; i < numbersSize; i++) {
            smartphone.call();
        }

        int urlsSize = smartphone.getUrls().size();
        for (int i = 0; i < urlsSize; i++) {
            smartphone.browse();
        }

    }
}
