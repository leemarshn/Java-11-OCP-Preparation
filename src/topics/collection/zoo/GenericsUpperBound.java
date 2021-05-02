package topics.collection.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

public class GenericsUpperBound {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(78);

        printNumbers(numbers);

        List<Double> doubleNumbers = new ArrayList<>();
        doubleNumbers.add(10.2);
        doubleNumbers.add(50.2);
        doubleNumbers.add(60.0);

        printNumbers(doubleNumbers);

        List<String> names = new ArrayList<>();
        names.add("Lee");
        names.add("Mary");

      // printNumbers(names);
    }

    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
       // numbers.get(0);
        //numbers.add(50);
    }
}
