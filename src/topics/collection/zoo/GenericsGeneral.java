package topics.collection.zoo;

import java.util.*;
import java.util.zip.DeflaterOutputStream;

public class GenericsGeneral {


    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("pi", 3.45458);
       // map.put("e", 2L);
        map.put("log(1)", new Double(0.0));
      //  map.put('x', new Double(5.2));

        map.forEach((K,v) -> System.out.println(K +" = "+ v));
        //use method reference
        map.values().forEach(System.out::println);
        //use map.entry.foreach
        map.entrySet().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
    }

}
