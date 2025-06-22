package Collections;

import java.util.Stack;
public class Demo {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push("A");
		s.push("N");
		s.push("X");
		System.out.println(s);
		System.out.println(s.search("N"));//returns Offset if the if the element is present otherwse returns -1
		System.out.println(s.search("Z"));
	}

}
