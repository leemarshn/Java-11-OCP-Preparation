package topics.collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WirldCardTest {
    public void showSize(List<?> list){
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        WirldCardTest wirldCardTest = new WirldCardTest();

       // List<?> list = new HashSet<String>();
       // ArrayList<?> arrayList = new ArrayList<?>(); //wildcard cannot be instantiated directly
        ArrayList<?	super Date>	list1	=	new	ArrayList<Date>();
//        List<Exception>	list2	=	new	LinkedList<IOException>();
        List<ClassCastException> list3 = new LinkedList<ClassCastException>();
        ArrayList	<?	extends	Number>	list4	=	new	ArrayList	<Integer>();
        wirldCardTest.showSize(list3);
    }
}
