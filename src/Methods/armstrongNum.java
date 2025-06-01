package Methods;

import java.util.Scanner;

public class armstrongNum {
	public static int power(int base, int raise){ //calculate the power
		int pow=1;
		for(int i=1; i<=raise; i++)
		{
			pow=pow*base;
		}
		return pow;
	}
	public static int count(int tem){  //count the total number of digit in the given number
		int cou=0;
		while(tem>0)
		{
			tem/=10;
			cou++;
		}
		return cou;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);        // user enter a number
		System.out.println("Enter Any Number:");
		int num=sc.nextInt();
		int count=count(num);
		int sum=0;
		int tem=num;        //store original number
		
		while(tem>0)
		{
			int rem=tem%10;
			sum=sum+power(rem,count);
			tem/=10;
		}
		if(sum==num)
		{
			System.out.println("It is Armstrong Number!");
		}
		else
		{
			System.out.println("It is Not Armstrong Number!");
		}
				
	}
}
