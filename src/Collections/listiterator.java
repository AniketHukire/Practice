package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class listiterator {
	public static void main(String [] args) {
		LinkedList l= new LinkedList();
		l.add("Aniket");
		l.add("Pratik");
		l.add("Mahesh");
		l.add("Ajinkay");
		System.out.println(l);
		ListIterator ltr= l.listIterator();
		while(ltr.hasNext())
		{
			String s= (String)ltr.next();
			if(s.equals("Pratik"))
			{
				ltr.remove();
			}
			if(s.equals("Mahesh"))
			{
				ltr.add("Ganesh");
			}
			if(s.equals("Ajinkay"))
			{
				ltr.add("Akash");
			}
		}
		System.out.println(l);
	}
}
