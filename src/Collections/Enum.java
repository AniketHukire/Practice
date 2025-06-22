package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enum {
	public static void main( String [] args ) {
		Vector v= new Vector();
		for(int i=0; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			Integer l= (Integer)e.nextElement();
			if(l%2 == 0)
				System.out.println(l);
		}
		System.out.println(v);
	}

}
