package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapdemo {
	public static void main(String [] args) {
		HashMap m = new HashMap();
		m.put("Aniket", 100);
		m.put("Ajinky", 300);
		m.put("Pratik", 500);
		m.put("Mahesh", 200);
		System.out.println(m);//{k=v, k=v,...}
		System.out.println(m.put("Ajinky", 800));//300
		
		Set s = m.keySet();//[k,k,..]
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);//[k=v, k=v,...

		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() +"...."+ m1.getValue());
			if(m1.getKey().equals("Pratik"))
			{
				m1.setValue(1000);
			}
		}
		System.out.println(m);
	}
}
