package Methods;

public class RangeOfPawer {
	public static void main(String args[]) {
		for(int start=10; start<=20; start++)
		{
			System.out.println(power(start,2+2));
		}
}
		public static int power(int base , int raise) 
		{
			int pow=1;
			for(int i=1; i<=raise; i++)
			{
				pow=pow*base;
			}
			 return pow;
		}
}


