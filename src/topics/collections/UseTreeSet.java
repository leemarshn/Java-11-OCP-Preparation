package topics.collections;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    public static void main(String[] args) {
        Set<DuckTreeSet> ducks = new TreeSet<>((d1, d2)->d1.getId()-d2.getId());
        ducks.add(new DuckTreeSet(123, "toy", "bird"));
        ducks.add(new DuckTreeSet(234, "hurtle", "snail"));
        ducks.add(new DuckTreeSet(554, "bae", "nork"));

        ducks.forEach(e -> System.out.println("id "+ e.getId() + " name: " +e.getName()));


    }
}
