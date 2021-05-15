package topics.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return t1.toLowerCase().compareTo(s.toLowerCase());
    }

    public static void main(String[] args) {
        Float k = Float.valueOf((float)9.0);
        Byte bb = Byte.valueOf((byte)8);
        Short s = Short.valueOf((short)4);
        String[] arr = {"123", "Abb", "aab"};
        Comparator<String> c = (a, b) -> a.toLowerCase().compareTo(b.toLowerCase());
        Arrays.sort(arr, c);

        for (String ar: arr)
            System.out.println(ar);
    }
}
