package ForLoop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		for(;;)
		{
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(num+" It is Prime Number");
			}
			else
			{
				System.out.println(num+" It is not Prime Number");
			}
		}
	}

}
