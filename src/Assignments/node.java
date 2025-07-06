package Assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class node {
	public static void main ( String [] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		PrintMiddle(list);
	}

	public static void PrintMiddle(LinkedList<Integer> list) {
		if(list.isEmpty())
		{
			System.out.println("The List Is Empty!");
			return;
		}
		
		Iterator<Integer> slow = list.iterator();
		Iterator<Integer> fast = list.iterator();
		
		int middlevalue = slow.next();//frist element
		
		while(fast.hasNext())
		{
			fast.next(); // move 1 step
			if(fast.hasNext()) 
			{
				fast.next();// move 2nd step
				middlevalue = slow.next();// slow move 1 step
			}
				
		}
		System.out.println("Middel Node Data : "+middlevalue);
	}
}
