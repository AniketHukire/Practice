package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasmapdemo {
	public static void main(String [] args) {
		HashMap m = new HashMap();
		m.put("Aniket", 101);
		m.put("Mahesh", 120);
		m.put("Ganesh", 125);
		m.put("Pratik", 130);
		System.out.println(m);
		System.out.println(m.put("Mahesh", 100));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"----"+m1.getValue());
			if(m1.getKey().equals("Ganesh"))
			{
				m1.setValue(200);
			}
		}
		System.out.println(m);
	}
}
