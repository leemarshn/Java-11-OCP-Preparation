package topics.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainStudents {
    public static void main(String[] args) {
//        Comparator<Students> compar = (a, b) -> a.getName().compareTo(b.getName());
//        Set<Students> student = new TreeSet<>(compar);
//        student.add(new Students("Lee", 54));
//        student.add(new Students("Sas", 50));

        Set<String> names = new TreeSet<>();
        names.add("Lee");
        names.add("Sas");



       Iterator<String> std = names.iterator();
       while (std.hasNext())
           System.out.println(std.next());


    }
}
