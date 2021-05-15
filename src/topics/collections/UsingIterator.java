package topics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {
    public static void main(String[] args) {
        List<Integer> countyCode = new ArrayList<>();
        for (int i=0; i<48; i++){
            countyCode.add(i);
        }

        //System.out.println(countyCode);

        Iterator<Integer> iterator = countyCode.iterator();

        while (iterator.hasNext()){

            if (iterator.next()==48)
                System.out.println(iterator.next());
        }

    }
}
