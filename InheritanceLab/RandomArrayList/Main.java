package InheritanceLab.RandomArrayList;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add("p");
        randomArrayList.add(1);
        randomArrayList.add('a');
        randomArrayList.add(new BigDecimal("1.24"));

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
    }
}
