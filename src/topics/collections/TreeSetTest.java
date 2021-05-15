package topics.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest implements Comparator<TreeSetTest> {

    private int num;
    private String text;

	public TreeSetTest(int num, String text) {
		this.num = num;
		this.text = text;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	//	Assume	getters/setters/constructors	provided

    public String toString() {
        return "" + num;
    }

    public int compareTo(TreeSetTest s) {
        return text.compareTo(s.text);
    }

    public int compare(TreeSetTest s1, TreeSetTest s2) {
        return s1.num - s2.num;
    }

    public static void main(String[] args) {
        var s1 = new TreeSetTest(88, "a");
        var s2 = new TreeSetTest(55, "b");
//        var t1 = new TreeSet<TreeSetTest>();
//        t1.add(s1);
//        t1.add(s2);
        var t2 = new TreeSet<TreeSetTest>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(""+ "	" + t2);

    }
}