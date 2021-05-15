package topics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AnotherMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(42817, "LeeN");
        students.put(2033325, "Sas");

       // students.forEach((k,v)-> System.out.println("ID: " + k + " name: " + v));
        students.entrySet().forEach(e -> System.out.println(e.getKey() + "- Name: " + e.getValue()));
//        Iterator<Map.Entry<Integer,String>> itr = students.entrySet().iterator();
//
////        while (itr.hasNext()){
////            Map.Entry<Integer, String> next = itr.next();
////            System.out.println("ID: " + next.getKey() + " - Name: " + next.getValue());
////        }
}
}
