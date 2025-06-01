package Methods;

public class Demo5 {
	//instance variables
	int x=100;
	int y=200;
	void add (int x, int y)//locall variables 
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y); // to represent instance variable using this keyword
	}
	
	public static void main(String [] args)
	{
		Demo5 d=new Demo5();
		d.add(400,900)
		;
	}

}
