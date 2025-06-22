package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {
	public static void main(String [] args) {
		TreeSet t= new TreeSet(new MyComparator2());
		t.add("A");
		t.add( new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCE");
		t.add("A");
		System.out.println(t);
	}
}
class MyComparator2 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();
		String s2= obj2.toString();
		int i1=s1.length();
		int i2=s2.length();
		
		if(i1 < i2)
		{
			return-1;
		}
		else if(i1 > i2)
		{
			return +1;
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
}
