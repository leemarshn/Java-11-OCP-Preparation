package topics.collections;

import java.util.ArrayList;
import java.util.List;

public class MainCompareObjects {
    public static void main(String[] args) {
        CompareObjects obj1 = new CompareObjects("FDSF", "Lee", "Nairobi");
        CompareObjects obj2 = new CompareObjects("FDSF", "Lee", "Nairobi");
        CompareObjects obj4 = new CompareObjects("ABCD", "Kaary", "Nairobi");
        CompareObjects obj5 = new CompareObjects("XDSPFDG", "Emily", "Nairobi");
        CompareObjects obj = new CompareObjects("ZEGH", "Alice", "Nairobi");


        List<CompareObjects> students = new ArrayList<>();
        students.add(obj);
        students.add(obj2);
        students.add(obj4);
        students.add(obj5);

        //before sort
        System.out.println(students);

        //natural ordering
        students.sort(null);
        System.out.println(students);

        //using Comparator interface or custom ordering
        students.sort(new CompareObjects());
        System.out.println(students);


        //comparing based on ID
        System.out.println(obj.equals(obj2));

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

//        System.out.println(obj.compareTo(obj5));
//        System.out.println(obj.compareTo(obj2));
    }
}












 //Student
//overide the equals method


//new st1
//new st2


//st1.equal(st2) == false

//if studentID==same




















