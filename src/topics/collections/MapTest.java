package topics.collections;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        var nums = new HashMap<Integer, Integer>();
        for (int i=1; i<10; i++){
            nums.put(i, i*i);
        }
        System.out.println(nums.get(4));
    }
}
