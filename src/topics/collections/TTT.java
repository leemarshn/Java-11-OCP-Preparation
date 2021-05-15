package topics.collections;

import java.util.Set;
import java.util.TreeSet;

public class TTT{


    static class Rabbit implements Comparable<Rabbit> {
        int id;

        @Override
        public int compareTo(Rabbit rabbit) {
            return 0;
        }
    }

     public static void main(String[] args) {
                Set<Rabbit> rabbits = new TreeSet<>();
                rabbits.add(new Rabbit());  // ClassCastException
         }
}

