package topics.collection.zoo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("LeeN");
        names.add("Faith");
        names.add("Kaary");

        print(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        print(numbers);
    }

    private static void print(List<?> items) {
        items.forEach(System.out::println);

    }
}
