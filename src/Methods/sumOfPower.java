package Methods;

public class sumOfPower {
	public static void main(String [] args) {
		int sum=0;
		for( int start=10; start<=20; start++) 
		{
			sum=sum+power(start,4);
			System.out.println(sum);
		}
	}
	public static int power(int base, int raise) 
	{
		int pow=1;
		for(int i=1; i<=raise; i++)
		{
			pow=pow*base;
		}
		return pow;
	}

}
