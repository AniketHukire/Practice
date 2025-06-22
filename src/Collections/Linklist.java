package Collections;

import java.util.LinkedList;

public class Linklist {
	public static void main(String [] args) {
		LinkedList l= new LinkedList();
		l.add("Aniket");
		l.add(30);
		l.add(null);
		l.add("Hukire");
		l.set(0, "Madhukar");
		l.add(0,"Nilesh");
		l.removeLast();
		l.addFirst("JAVA");
		System.out.println(l);
	}

}
