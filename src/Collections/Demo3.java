package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {
	public static void main(String [] args) {
		TreeSet<String> t= new TreeSet<String>(new MyComplement1());
		t.add("Aniket");
		t.add("Ajinky");
		t.add("Pratik");
		t.add("Nilesh");
		t.add("Ganesh");
		System.out.println(t);//Alphabeticale Order
	}
}
class MyComplement1 implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String s1= obj1.toString();
		String s2= obj2.toString();
		return s1.compareTo(s2);
	}
}
