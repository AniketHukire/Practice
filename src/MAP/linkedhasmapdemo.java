package MAP;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhasmapdemo {
	public static void main(String [] args) {
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("Aniket", 100);
		lm.put("Pratik",200);
		lm.put("Ganesh", 300);
		lm.put("Mahesh", 150);
		lm.put("Ajinky", 250);
		System.out.println(lm);
		System.out.println(lm.put("Ganesh", 500));
		Set s = lm.keySet();
		System.out.println(s);
		Collection c = lm.values();
		System.out.println(c);
		Set s1 = lm.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry lm1 = (Map.Entry)itr.next();
			System.out.println(lm1.getKey()+"----"+lm1.getValue());
			if(lm1.getKey().equals("Ajinky"))
			{
				lm1.setValue(700);
			}
		}
		System.out.println(lm);
	}
}
