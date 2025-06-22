package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo5 {
	public static void main (String [] args) {
		Employee e1= new Employee("Mahesh",100);
		Employee e2= new Employee("Pratik", 200);
		Employee e3= new Employee("Ajinky", 50);
		Employee e4= new Employee("Aniket", 150);
		Employee e5= new Employee("Ganesh", 200);
		TreeSet t= new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		TreeSet t2= new TreeSet();
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
	}
}
class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name, int eid)
	{
		this.name= name;
		this.eid= eid;
	}
	public String toString()
	{
		return name+"...."+eid;
	}
	public int compareTo(Object obj)
	{
		int eid1= this.eid;
		Employee e= (Employee)obj;
		int eid2= e.eid;
		if(eid1 < eid2)
		{
			return-1;
		}
		else if(eid1 > eid2)
		{
			return +1;
		}
		else 
		{
			return 0;
		}
	}
	
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2)
	{
		Employee e1= (Employee) obj1;
		Employee e2= (Employee) obj2;
		String s1= e1.name;
		String s2= e2.name;
		return s1.compareTo(s2);
	}
}
