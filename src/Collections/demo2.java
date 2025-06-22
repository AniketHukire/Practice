package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class demo2 {
	public static void main (String [] args) {
		TreeSet t= new TreeSet(new MyComparator());
		t.add(10);
		t.add(13);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
 class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		//return i1.compareTo(i2); Ascending Order
		//return -i1.compareTo(i2); Desending Order
		if(i1 < i2)
		{
			return +1;
		}
		else if(i1 > i2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}