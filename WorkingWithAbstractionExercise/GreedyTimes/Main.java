package WorkingWithAbstractionExercise;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] stats = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long stones = 0;
        long money = 0;

        for (int i = 0; i < stats.length; i += 2) {
            String name = stats[i];
            long count = Long.parseLong(stats[i + 1]);

            String currentItem = "";

            if (name.length() == 3) {
                currentItem = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                currentItem = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                currentItem = "Gold";
            }

            if (currentItem.equals("")) {
                continue;
            } else if (input < bag.values()
                    .stream().map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + count) {
                continue;
            }

            switch (currentItem) {
                case "Gem":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gold")) {
                            if (count > bag.get("Gold").values()
                                    .stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values()
                            .stream()
                            .mapToLong(e -> e).sum() + count > bag.get("Gold").values()
                            .stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gem")) {
                            if (count > bag.get("Gold").values()
                                    .stream()
                                    .mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values()
                            .stream()
                            .mapToLong(e -> e).sum() + count > bag.get("Gem").values()
                            .stream()
                            .mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(currentItem)) {
                bag.put((currentItem), new LinkedHashMap<>());
            }

            if (!bag.get(currentItem).containsKey(name)) {
                bag.get(currentItem).put(name, 0L);
            }


            bag.get(currentItem).put(name, bag.get(currentItem).get(name) + count);
            if (currentItem.equals("Gold")) {
                gold += count;
            } else if (currentItem.equals("Gem")) {
                stones += count;
            } else if (currentItem.equals("Cash")) {
                money += count;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream()
                    .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}