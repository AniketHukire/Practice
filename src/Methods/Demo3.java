package Methods;

public class Demo3 {
	void m1(int a,char ch)  //instance method
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	
	static void m2(String s, double d)   // static method
	{
		System.out.println("m2 Methd");
		System.out.println(s);
		System.out.println(d);
	}
	
	public static void main(String [] args)
	{
		Demo3 d=new Demo3(); //call instance method using object
		d.m1(10,'A');
		
		Demo3.m2("Aniket", 34.5);   //call static method using class name
	}
}
