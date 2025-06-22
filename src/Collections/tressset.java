package Collections;

import java.util.TreeSet;

public class tressset {
	public static void main(String [] args) {
		TreeSet ts= new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("a");
		ts.add("J");
		//ts.add(10);
		//ts.add(null);classcastException
		System.out.println(ts);
	}

}
