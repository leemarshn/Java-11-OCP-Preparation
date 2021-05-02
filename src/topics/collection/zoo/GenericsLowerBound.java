package topics.collection.zoo;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBound {


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

        List<Double> doubles = new ArrayList<>();


       addToList(numbers, 10);
//       addToList(doubles, 20.2);

        List<Number> nums = new ArrayList<>();

        addToList(nums, 102);

    }

    private static void addToList(List<? super Integer> numbers, Integer i) {
        numbers.add(i);
    }

    private static void print(List<?> items) {
        items.forEach(System.out::println);

    }
}