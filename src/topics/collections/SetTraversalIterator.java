package topics.collections;

import java.util.*;

public class SetTraversalIterator {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("lee");
        names.add("Nyambura");
        names.add("marion");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

    }
}
