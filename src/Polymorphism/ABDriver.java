package Polymorphism;

public class ABDriver {
	public static void main(String [] args)
	{
		A a1 = new B();//Up casting
		a1.UseFul();//calls A 
		a1.UseLess();// Calls B overried Method
	}
}
